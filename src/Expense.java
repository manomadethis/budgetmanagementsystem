import java.util.ArrayList;
import java.util.List;
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
    
    public static String expensesFolder = "expense_tables/";

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

    
    
    public static void calculateDifference(javax.swing.JTable table) {
        javax.swing.table.TableModel model = table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            int budget = Integer.parseInt(model.getValueAt(i, 1).toString());
            int actualSpent = Integer.parseInt(model.getValueAt(i, 2).toString());
            int difference = budget - actualSpent;
            model.setValueAt(difference, i, 3);

            javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer();
            renderer.setForeground(table.getForeground());
            table.getColumnModel().getColumn(3).setCellRenderer(renderer);
            CurrencyRenderer.formatCurrencyColumns(table, 1, 2, 3);
            
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

    public static boolean checkEmpty(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 1; j < model.getColumnCount(); j++) {
                if (model.getValueAt(i, j) != null && !model.getValueAt(i, j).toString().isEmpty()) {
                    // Return false if any row has data other than the first column
                    return false;
                }
            }
        }
        // Return true if all rows have no data except for the first column
        return true;
    }
    
}
