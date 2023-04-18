import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felicia
 */
public class BudgetGUI extends javax.swing.JFrame {

    /**
     * Creates new form BudgetGUI
     */
    public BudgetGUI() {
        initComponents();
        setVisible(true);
    }
    
    private void clearTables() {
        entertainmentScrollPane.setVisible(false);
        entertainmentTable.setVisible(false);
        foodScrollPane.setVisible(false);
        foodTable.setVisible(false);
        travelScrollPane.setVisible(false);
        travelTable.setVisible(false);
        housingScrollPane.setVisible(false);
        housingTable.setVisible(false);
    }
    
    private JTable visibleTable() {
        if (housingTable.isVisible()) {
            return housingTable;
        } else if (foodTable.isVisible()) {
            return foodTable;
        } else if (entertainmentTable.isVisible()) {
            return entertainmentTable;
        } else if (travelTable.isVisible()) {
            return travelTable;
        } else {
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarPanel = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        dashboardButton = new javax.swing.JButton();
        incomeButton = new javax.swing.JButton();
        expensesButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        dashboardPanel = new javax.swing.JPanel();
        dashboardLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jHomeTable = new javax.swing.JTable();
        jTotalButton = new javax.swing.JButton();
        budgetPanel = new javax.swing.JPanel();
        incomeLabel = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        settingsLabel = new javax.swing.JLabel();
        expensesPanel = new javax.swing.JPanel();
        foodButton = new javax.swing.JButton();
        entertainmentButton = new javax.swing.JButton();
        travelButton = new javax.swing.JButton();
        expensesLabel = new javax.swing.JLabel();
        housingButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        entertainmentScrollPane = new javax.swing.JScrollPane();
        entertainmentTable = new javax.swing.JTable();
        filterButton = new javax.swing.JButton();
        foodScrollPane = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        travelScrollPane = new javax.swing.JScrollPane();
        travelTable = new javax.swing.JTable();
        housingScrollPane = new javax.swing.JScrollPane();
        housingTable = new javax.swing.JTable();
        calendar = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        addDataButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarPanel.setBackground(new java.awt.Color(112, 0, 73));
        sidebarPanel.setAutoscrolls(true);
        sidebarPanel.setPreferredSize(new java.awt.Dimension(60, 600));
        sidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        sidebarPanel.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 60, 40));
        sidebarPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 59, 12));

        dashboardButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard.png"))); // NOI18N
        dashboardButton.setBorderPainted(false);
        dashboardButton.setContentAreaFilled(false);
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        sidebarPanel.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 40));

        incomeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        incomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transactions_36.png"))); // NOI18N
        incomeButton.setBorderPainted(false);
        incomeButton.setContentAreaFilled(false);
        incomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeButtonActionPerformed(evt);
            }
        });
        sidebarPanel.add(incomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 40));

        expensesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        expensesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manage_budget_36.png"))); // NOI18N
        expensesButton.setBorderPainted(false);
        expensesButton.setContentAreaFilled(false);
        expensesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensesButtonActionPerformed(evt);
            }
        });
        sidebarPanel.add(expensesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 60, 30));

        reportButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        reportButton.setBorderPainted(false);
        reportButton.setContentAreaFilled(false);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        sidebarPanel.add(reportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 60, 40));

        settingsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings.png"))); // NOI18N
        settingsButton.setBorderPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        sidebarPanel.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 60, -1));

        logoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        sidebarPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 60, 40));

        getContentPane().add(sidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setAutoscrolls(true);

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setAutoscrolls(true);
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboardLabel.setText("Home");
        dashboardPanel.add(dashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, 50));

        jHomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Entertainment", null},
                {"Food", null},
                {"Travel", null},
                {"Housing", null},
                {null, null},
                {"Total", null}
            },
            new String [] {
                "Category Totals", ""
            }
        ));
        jScrollPane1.setViewportView(jHomeTable);
        if (jHomeTable.getColumnModel().getColumnCount() > 0) {
            jHomeTable.getColumnModel().getColumn(0).setHeaderValue("Category Totals");
            jHomeTable.getColumnModel().getColumn(1).setHeaderValue("");
        }

        dashboardPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 390, 150));

        jTotalButton.setText("Calculate Total");
        jTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(jTotalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        tabbedPane.addTab("Dashboard", dashboardPanel);

        budgetPanel.setBackground(new java.awt.Color(255, 255, 255));
        budgetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        incomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        incomeLabel.setText("Income");
        budgetPanel.add(incomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, 50));

        tabbedPane.addTab("Budget", budgetPanel);

        reportPanel.setBackground(new java.awt.Color(255, 255, 255));
        reportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportLabel.setText("Report");
        reportPanel.add(reportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, 50));

        tabbedPane.addTab("Report", reportPanel);

        settingsPanel.setBackground(new java.awt.Color(255, 255, 255));
        settingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        settingsLabel.setText("Settings");
        settingsPanel.add(settingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, 50));

        tabbedPane.addTab("Settings", settingsPanel);

        expensesPanel.setBackground(new java.awt.Color(255, 255, 255));
        expensesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        foodButton.setBackground(new java.awt.Color(255, 204, 204));
        foodButton.setText("Food");
        foodButton.setBorderPainted(false);
        foodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(foodButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        entertainmentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        entertainmentButton.setBackground(new java.awt.Color(204, 255, 255));
        entertainmentButton.setText("Entertainment");
        entertainmentButton.setBorderPainted(false);
        entertainmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entertainmentButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(entertainmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        travelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        travelButton.setBackground(new java.awt.Color(255, 255, 153));
        travelButton.setText("Travel");
        travelButton.setBorderPainted(false);
        travelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(travelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        expensesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        expensesLabel.setText("Expenses");
        expensesPanel.add(expensesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 50));

        housingButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        housingButton.setBackground(new java.awt.Color(205, 204, 255));
        housingButton.setText("Housing");
        housingButton.setBorderPainted(false);
        housingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housingButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(housingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        expensesPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

        entertainmentTable.setAutoCreateRowSorter(true);
        entertainmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amusement Park", "$", "$", "$"},
                {"Concert", "$", "$", "$"},
                {"Hotel stay", "$", "$", "$"},
                {"Games", "$", "$", "$"},
                {"Party", "$", "$", "$"}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        entertainmentTable.setToolTipText("Double-click to edit data");
        entertainmentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        entertainmentTable.setGridColor(new java.awt.Color(112, 0, 73));
        entertainmentTable.setInheritsPopupMenu(true);
        entertainmentTable.setName(""); // NOI18N
        entertainmentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        entertainmentTable.setShowGrid(true);
        entertainmentTable.setSurrendersFocusOnKeystroke(true);
        entertainmentTable.getTableHeader().setReorderingAllowed(false);
        entertainmentScrollPane.setViewportView(entertainmentTable);

        expensesPanel.add(entertainmentScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        filterButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        filterButton.setBackground(new java.awt.Color(204, 153, 255));
        filterButton.setText("FILTER");
        expensesPanel.add(filterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Breakfast", "", "", ""},
                {"Lunch", null, null, null},
                {"Dinner", null, "", null},
                {"Drinks", null, null, null}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        foodTable.setShowGrid(true);
        foodScrollPane.setViewportView(foodTable);

        expensesPanel.add(foodScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        travelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Flight", "", "", ""},
                {"Fuel", null, null, null},
                {"Taxi fare", null, "", null},
                {"Bus fare", null, null, null},
                {"Parking", null, null, null}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        travelTable.setShowGrid(true);
        travelScrollPane.setViewportView(travelTable);

        expensesPanel.add(travelScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        housingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" Rent/Mortgage", "", "", ""},
                {"Taxes", null, null, null},
                {"Water ", null, "", null},
                {"Gas", null, null, null},
                {"Electricity", null, null, null},
                {"Cable/Internet services", null, null, null},
                {"Insurance", null, null, null},
                {"Maintenance", null, null, null}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        housingTable.setShowGrid(true);
        housingScrollPane.setViewportView(housingTable);

        expensesPanel.add(housingScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        calendar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        calendar.setToolTipText("Select a date");
        calendar.setDate(new java.util.Date(1681286657000L));
        calendar.setDecorationBackgroundColor(new java.awt.Color(105, 255, 222));
        expensesPanel.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 240, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Select date:");
        expensesPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 100, 30));

        addDataButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addDataButton.setBackground(new java.awt.Color(51, 255, 255));
        addDataButton.setText("ADD DATA");
        addDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(addDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, -1));

        deleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        deleteButton.setBackground(new java.awt.Color(255, 0, 102));
        deleteButton.setText("DELETE");
        expensesPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));

        tabbedPane.addTab("Expenses", expensesPanel);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -30, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void expensesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensesButtonActionPerformed
        tabbedPane.setSelectedIndex(4);
        clearTables();
        entertainmentScrollPane.setVisible(true);
        entertainmentTable.setVisible(true);
    }//GEN-LAST:event_expensesButtonActionPerformed

    private void incomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeButtonActionPerformed
        tabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_incomeButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        tabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        tabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        tabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // Toggle the sidebar panel's preferred size when the menu button is clicked
        if (sidebarPanel.getPreferredSize().width == 60) {
            sidebarPanel.setPreferredSize(new Dimension(200, 600));
        } else { 
            sidebarPanel.setPreferredSize(new Dimension(60, 600));
        }
        // Repack the JFrame to adjust its size to the new preferred size of the sidebar panel
        revalidate();
        pack();
    }//GEN-LAST:event_menuButtonActionPerformed

    private void addDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataButtonActionPerformed
        // Get the currently visible table
        JTable visibleTable = visibleTable();
        // Get the table model of the visible table
        DefaultTableModel model = (DefaultTableModel) visibleTable.getModel();
        // Create a new row of data to add to the table
        Object[] newRowData = {"New Expense", null, null, null};
        // Add the new row to the table model
        model.addRow(newRowData);
    }//GEN-LAST:event_addDataButtonActionPerformed

    private void foodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodButtonActionPerformed
        clearTables();
        foodScrollPane.setVisible(true);
        foodTable.setVisible(true);
    }//GEN-LAST:event_foodButtonActionPerformed

    private void housingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housingButtonActionPerformed
        clearTables();
        housingScrollPane.setVisible(true);
        housingTable.setVisible(true);
    }//GEN-LAST:event_housingButtonActionPerformed

    private void jTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalButtonActionPerformed
        /*// TODO add your handling code here:
        jHomeTable model = jHomeTable.getModel();

// Create an ArrayList to hold the row totals
        //List<Double> rowTotals = new ArrayList<>();

// Iterate over the rows in the table model and add up the values in the desired columns
        for (int i = 0; i < model.getRowCount(); i++) {
            double total = 0.0;
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
                if (value instanceof Number) {
                    total += ((Number) value).doubleValue();
                }
            }
        rowTotals.add(total);
        }

// Create a new column in the table model to display the row totals
        model.addColumn("Total", rowTotals.toArray());
        
// Update the UI to display the new column
       jHomeTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);*/
    }//GEN-LAST:event_jTotalButtonActionPerformed

    private void travelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        clearTables();
        travelScrollPane.setVisible(true);
        travelTable.setVisible(true);
    }  
    
    private void entertainmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        clearTables();
        entertainmentScrollPane.setVisible(true);
        entertainmentTable.setVisible(true);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDataButton;
    private javax.swing.JPanel budgetPanel;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton entertainmentButton;
    private javax.swing.JScrollPane entertainmentScrollPane;
    private javax.swing.JTable entertainmentTable;
    private javax.swing.JButton expensesButton;
    private javax.swing.JLabel expensesLabel;
    private javax.swing.JPanel expensesPanel;
    private javax.swing.JButton filterButton;
    private javax.swing.JButton foodButton;
    private javax.swing.JScrollPane foodScrollPane;
    private javax.swing.JTable foodTable;
    private javax.swing.JButton housingButton;
    private javax.swing.JScrollPane housingScrollPane;
    private javax.swing.JTable housingTable;
    private javax.swing.JButton incomeButton;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JTable jHomeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jTotalButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton travelButton;
    private javax.swing.JScrollPane travelScrollPane;
    private javax.swing.JTable travelTable;
    // End of variables declaration//GEN-END:variables
}
