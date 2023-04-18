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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Felicia
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new MainGUI();
    }

    public static void exportTable(ArrayList<List<String>> dataList, String folderName, String filename) throws IOException {
        FileWriter writer = new FileWriter(folderName + filename);
        for (List<String> row : dataList) {
            for (String value : row) {
                writer.write(value + "\t");
            }
            writer.write("\n");
        }
        writer.close();
    }
    
    public static void exportTable(ArrayList<List<String>> dataList, String folderName, String filename, Date selectedDate) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateFolder = dateFormat.format(selectedDate);
        File folder = new File(folderName + dateFolder);
        folder.mkdirs();
            
        FileWriter writer = new FileWriter(folderName + dateFolder + "/" + filename);
        for (List<String> row : dataList) {
            for (String value : row) {
                writer.write(value + "\t");
            }
            writer.write("\n");
        }
        writer.close();
    }

    public static void importTable(DefaultTableModel model, String folderName, String filename, Date selectedDate) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateFolder = dateFormat.format(selectedDate);
        File file = new File(folderName + dateFolder + "/" + filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + filename + " not found in folder " + dateFolder + ".");
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("\t");
            model.addRow(values);
        }
        reader.close();
    }
    
    
    
    public static void loadTableData(JTable table, String folderName, String filename, ArrayList<List<String>> dataList) {
        try (Scanner scanner = new Scanner(new File(folderName + filename))) {
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
    

    public static void loadTableData(JTable table, String folderName, String filename, Date selectedDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateFolder = dateFormat.format(selectedDate);
        try (Scanner scanner = new Scanner(new File("expense_tables/" + dateFolder + "/" + filename))) {
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
    
}
