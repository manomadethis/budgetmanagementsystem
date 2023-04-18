import java.awt.Color;
import java.text.NumberFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class CurrencyRenderer extends DefaultTableCellRenderer {

    public CurrencyRenderer() {
        setHorizontalAlignment(SwingConstants.RIGHT);
    }

    public void setValue(Object value) {
        if (value != null) {
            Double amount = Double.parseDouble(value.toString());
            setText(NumberFormat.getCurrencyInstance().format(amount));

            if (amount < 0) {
                setForeground(Color.RED);
            } else {
            if (amount >= 0) {
                setForeground(Color.BLACK);
                }
            }

        } else {
            setText("");
        }
    }

    // Add this method to format multiple columns at once
    public static void formatCurrencyColumns(javax.swing.JTable table, int...   columns) {
        for (int col : columns) {
            table.getColumnModel().getColumn(col).setCellRenderer(new CurrencyRenderer());
        }
    }
}
