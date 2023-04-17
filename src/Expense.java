import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.toedter.calendar.JCalendar;

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
    public static ArrayList<List<String>> travelData = new ArrayList<>();
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

    void exportTable(ArrayList<List<String>> dataList, String filename) throws IOException {
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
    
    
}
