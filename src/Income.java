import java.util.ArrayList;
import java.util.List;

import com.toedter.calendar.JCalendar;

public class Income {
    protected String sourceOfIncome;
    protected int amount;
    protected JCalendar date;

    public static ArrayList<List<String>> incomeData = new ArrayList<>();
    
    private static String incomeFolder = "income_table/";

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
}