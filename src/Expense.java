import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felicia
 */

public class Expense {
    protected String name;
    protected int budget;
    protected int actualSpent;
    protected int difference;

    public static ArrayList<List<String>> entertainmentData = new ArrayList<>();
    public static ArrayList<List<String>> foodData = new ArrayList<>();
    public static ArrayList<List<String>> transportationData = new ArrayList<>();
    public static ArrayList<List<String>> housingData = new ArrayList<>();
    public static ArrayList<List<String>> otherData = new ArrayList<>();

    public Expense(String name, int budget, int actualSpent, int difference) {
        this.name = name;
        this.budget = budget;
        this.actualSpent = actualSpent;
        this.difference = difference;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public int getActualSpent() {
        return actualSpent;
    }

    public int getDifference() {
        return difference;
    }

    public static void exportTable(ArrayList<List<String>> dataList, String filename) throws IOException {
        FileWriter writer = new FileWriter("expense_tables/" + filename);
        for (List<String> row : dataList) {
            for (String value : row) {
                writer.write(value + "\t");
            }
            writer.write("\n");
        }
        writer.close();
    }
    
    public static void exportTable(ArrayList<List<String>> dataList, String filename, Date selectedDate) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String folderName = dateFormat.format(selectedDate);
        File folder = new File("expense_tables/" + folderName);
        folder.mkdirs();
            
        FileWriter writer = new FileWriter("expense_tables/" + folderName + "/" + filename);
        for (List<String> row : dataList) {
            for (String value : row) {
                writer.write(value + "\t");
            }
            writer.write("\n");
        }
        writer.close();
    }

    public static void importTable(ArrayList<List<String>> dataList, String filename, Date selectedDate) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String folderName = dateFormat.format(selectedDate);
        File file = new File("expense_tables/" + folderName + "/" + filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + filename + " not found in folder " + folderName + ".");
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("\t");
            dataList.add(Arrays.asList(values));
        }
        reader.close();
    }
    
    
    public static void loadTableData(JTable table, String filename, ArrayList<List<String>> dataList) {
        try (Scanner scanner = new Scanner(new File("expense_tables/" + filename))) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            dataList.clear();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\t");
                model.addRow(data);
                dataList.add(Arrays.asList(data));
            }
       }
       catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "File not found: " + filename, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public static void loadTableData(JTable table, String filename, Date selectedDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String folderName = dateFormat.format(selectedDate);
        try (Scanner scanner = new Scanner(new File("expense_tables/" + folderName + "/" + filename))) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\t");
                model.addRow(data);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found: " + filename, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void clearTableData(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 1; j < model.getColumnCount(); j++) {
                model.setValueAt(null, i, j);
                // Or use an empty string instead of null:
                // model.setValueAt("", i, j);
            }
        }
    }
    
    
}
