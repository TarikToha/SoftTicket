package home;

import javax.swing.table.DefaultTableModel;

public class TrainSchPanel extends javax.swing.JPanel {

    public TrainSchPanel() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schtableSP = new javax.swing.JScrollPane();
        SchTable sch_Table = new SchTable();
        String [][] schRowData = sch_Table.getSchData();
        String [] schColumnNames = sch_Table.getSchColumnNames();
        schTable = new javax.swing.JTable(schRowData, schColumnNames);

        schTable.setModel(new DefaultTableModel(schRowData, schColumnNames) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        schTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        schTable.getTableHeader().setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
        schTable.setName("Train Schedule"); // NOI18N
        schTable.setRowHeight(32);
        schTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        schtableSP.setViewportView(schTable);
        schTable.setAutoCreateRowSorter(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(schtableSP, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(schtableSP, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable schTable;
    private javax.swing.JScrollPane schtableSP;
    // End of variables declaration//GEN-END:variables
}
