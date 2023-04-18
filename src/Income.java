import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;

public class Income {
    protected String sourceOfIncome;
    protected int amount;
    protected JCalendar date;

    public static ArrayList<List<String>> incomeData = new ArrayList<>();
    
    public static String incomeFolder = "income_table/";

    public Income(String sourceOfIncome, int amount, JCalendar date) {
        this.sourceOfIncome = sourceOfIncome;
        this.amount = amount;
        this.date = date;
    }

    public String getSourceOfIncome(){
        return sourceOfIncome;
    }

    public int getAmount(){
        return amount;
    }

    public JCalendar getDate(){
        return date;
    }

    public static boolean checkEmpty(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 1; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
                if (value != null && !value.toString().isEmpty()) {
                    // Return false if any non-empty cell is found
                    return false;
                }
            }
        }
        // Return true if all cells are empty
        return true;
    }

    public static void clearTableData(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                model.setValueAt(null, i, j);
                // Or use an empty string instead of null:
                // model.setValueAt("", i, j);
            }
        }
    }
    
}