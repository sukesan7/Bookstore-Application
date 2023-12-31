/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstore.ui;

import java.util.ArrayList;
import bookstore.Book;
import bookstore.states.ActionsEnum;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author porom
 */
public class AdminBooksPage extends javax.swing.JFrame 
                            implements IAdminTablePage{
    /**
     * Creates new form AdminBooksPage
     */
    public AdminBooksPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        bookTable.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        bookTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        bookTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        /* Load in the books */
        refreshTable();
        
        bookTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                /* Update the number of selected rows label */
                int rowsSelected = bookTable.getSelectedRows().length;
                bookSelectionLabel.setText(rowsSelected + " Books Selected");
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        bookNameInput = new javax.swing.JTextField();
        bookPriceInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookAddBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        back = new javax.swing.JToggleButton();
        bookSelectionLabel = new javax.swing.JLabel();
        bookDeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookTable);
        bookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (bookTable.getColumnModel().getColumnCount() > 0) {
            bookTable.getColumnModel().getColumn(0).setResizable(false);
            bookTable.getColumnModel().getColumn(1).setResizable(false);
        }

        bookNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Book Price");

        jLabel2.setText("Book Name");

        jLabel3.setText("Insert Book");

        bookAddBtn.setText("Add");
        bookAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAddBtnActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        bookSelectionLabel.setText("0 Books Selected");

        bookDeleteBtn.setText("Delete");
        bookDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bookAddBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bookDeleteBtn))
                            .addComponent(bookSelectionLabel))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bookAddBtn)))
                .addGap(39, 39, 39)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookSelectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookDeleteBtn)
                .addGap(31, 31, 31)
                .addComponent(back)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAddBtnActionPerformed
        this.addEntity();
    }//GEN-LAST:event_bookAddBtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        BookStoreLauncher.processEvent(ActionsEnum.BACK);
    }//GEN-LAST:event_backActionPerformed

    private void bookDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDeleteBtnActionPerformed
        this.removeEntity();
    }//GEN-LAST:event_bookDeleteBtnActionPerformed

    private void bookNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton back;
    private javax.swing.JButton bookAddBtn;
    private javax.swing.JButton bookDeleteBtn;
    private javax.swing.JTextField bookNameInput;
    private javax.swing.JTextField bookPriceInput;
    private javax.swing.JLabel bookSelectionLabel;
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addEntity() {
        String bookName = bookNameInput.getText();
        float bookPrice;
        try{
            bookPrice = Float.parseFloat(bookPriceInput.getText());
        } catch(Exception e){
            System.out.println("No letters in the price field");
            return;
        }

        if(bookName.equals("")){
            return;
        }
        Book bookToAdd = new Book(bookName, bookPrice, BookStoreLauncher.admin);
        BookStoreLauncher.admin.addBook(bookToAdd);
        refreshTable();
    }

    @Override
    public void removeEntity() {
        int[] selectedRows = bookTable.getSelectedRows();
        DefaultTableModel bookTableModel = (DefaultTableModel)bookTable.getModel();
        for(int row: selectedRows){
            String bookName = bookTableModel.getValueAt(row, 0).toString();
            float bookPrice;
            try{
                bookPrice = Float.parseFloat(String.valueOf(bookTableModel.getValueAt(row, 1)));
            }catch(Exception e){
                System.out.println("Something went wrong :(");
                return;
            }
            BookStoreLauncher.admin.removeBook(new Book(bookName, bookPrice, 
                                                        BookStoreLauncher.admin));
        }
        refreshTable();
    }
    
    @Override
    public void refreshTable(){
        ArrayList<Book> booksToLoad = BookStoreLauncher.admin.getBooks();
        DefaultTableModel bookTableModel = (DefaultTableModel) bookTable.getModel();
        /* Empty the table first */
        bookTableModel.setRowCount(0);
        for(Book book: booksToLoad){
            bookTableModel.addRow(new Object[]{book.title(), book.price()});
        }
    }

}
