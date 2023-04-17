/**
 *
 * @author Felicia
 */

import java.util.ArrayList;

public class EntertainmentExpenses {
    private ArrayList<Expense> expenses;

    public EntertainmentExpenses() {
        expenses = new ArrayList<>();
        expenses.add(new Expense("Amusement Park", 0, 0, 0));
        expenses.add(new Expense("Concert", 0, 0, 0));
        expenses.add(new Expense("Hotel stay", 0, 0, 0));
        expenses.add(new Expense("Games", 0, 0, 0));
        expenses.add(new Expense("Party", 0, 0, 0));
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public void updateFromTable(javax.swing.JTable table) {
        for (int i = 0; i < expenses.size(); i++) {
            expenses.get(i).budget = Integer.parseInt((String)table.getValueAt(i, 1));
            expenses.get(i).actualSpent = Integer.parseInt((String)table.getValueAt(i, 2));
            expenses.get(i).difference = Integer.parseInt((String)table.getValueAt(i, 3));
        }
    }

    public void exportToFile(String filename) {
        // code to export to file goes here
    }
}
 