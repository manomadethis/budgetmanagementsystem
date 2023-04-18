import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Report {
    private String expense;
    private String category;
    private double total;
    private String date;

    public static float dailyTotalBudget;
    public static float dailyTotalActualSpent;
    public static float dailyTotalDifference;

    public static ArrayList<List<String>> reportData = new ArrayList<>();
    public static ArrayList<List<String>> dailyReportData = new ArrayList<>();
    
    public Report(String expense, String category, double total, String date) {
        this.expense = expense;
        this.category = category;
        this.total = total;
        this.date = date;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static void populateReportTable(Date selectedDate, DefaultTableModel tableModel) throws IOException {
        // Format the selected date string in yyyy/MM/dd format for directory creation
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateFolder = dateFormat.format(selectedDate);
    
        // Create the directory path for the selected date and check if it exists
        String directoryPath = Expense.expensesFolder + File.separator + dateFolder;
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            // Notify the user if the directory does not exist
            JOptionPane.showMessageDialog(null, "The directory does not exist for selected date.");
            return;
        }
    
        // Loop through each table file in the directory
        File[] tableFiles = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        for (File tableFile : tableFiles) {
            try (Scanner scanner = new Scanner(tableFile)) {
                // Skip the first line of the table file (contains column names)
                scanner.nextLine();
    
                // Iterate through each row in the table file and add it to the table model
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] row = line.split("\\s+");
                    Object[] rowData = {row[0], tableFile.getName().replace(".txt", ""), Float.parseFloat(row[1]), row[2] + " " + row[3]};
                    tableModel.addRow(rowData);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
}
