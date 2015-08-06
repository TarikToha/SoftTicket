package home;

import multimedia.Sounds;
import javax.swing.table.DefaultTableModel;

public class RouteFarePanel extends javax.swing.JPanel {

    public RouteFarePanel() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputRFPanel = new javax.swing.JPanel();
        inputRFLabel = new javax.swing.JLabel();
        inputRFTF = new javax.swing.JTextField();
        helpRFLabel = new javax.swing.JLabel();
        routeFareListSP = new javax.swing.JScrollPane();
        routeFareTable = new javax.swing.JTable();

        inputRFLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        inputRFLabel.setText("Enter Train No :");

        inputRFTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        inputRFTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputRFTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRFTFActionPerformed(evt);
            }
        });

        helpRFLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        helpRFLabel.setText("Visit Train Schedule Tab.  Example :  763  ");

        javax.swing.GroupLayout inputRFPanelLayout = new javax.swing.GroupLayout(inputRFPanel);
        inputRFPanel.setLayout(inputRFPanelLayout);
        inputRFPanelLayout.setHorizontalGroup(
            inputRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputRFPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(inputRFLabel)
                .addGap(40, 40, 40)
                .addComponent(inputRFTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(helpRFLabel)
                .addGap(0, 0, 0))
        );
        inputRFPanelLayout.setVerticalGroup(
            inputRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputRFPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(inputRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputRFLabel)
                    .addComponent(inputRFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpRFLabel))
                .addGap(0, 0, 0))
        );

        routeFareListSP.setBorder(null);

        routeFareTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        routeFareTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        routeFareTable.setRowHeight(20);
        routeFareTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        routeFareTable.getTableHeader().setReorderingAllowed(false);
        routeFareTable.getTableHeader().setResizingAllowed(false);
        routeFareListSP.setViewportView(routeFareTable);
        routeFareTable.getTableHeader().setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(inputRFPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addComponent(routeFareListSP, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(inputRFPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(routeFareListSP, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputRFTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRFTFActionPerformed
        try{
            RouteFareList routeFare = new RouteFareList(evt.getActionCommand());
            String [][] rfRowData = routeFare.getRFData();
            String [] rfColumnNames = routeFare.getRFColumnNames();

            routeFareTable.setModel(new DefaultTableModel(rfRowData, rfColumnNames){
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            });
            routeFareTable.getColumnModel().getColumn(1).setMinWidth(150);
            routeFareTable.getColumnModel().getColumn(2).setMinWidth(100);
            routeFareTable.getColumnModel().getColumn(3).setMinWidth(120);
            
            new Sounds().rfSound();
        } catch (Exception e) {}
    }//GEN-LAST:event_inputRFTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helpRFLabel;
    private javax.swing.JLabel inputRFLabel;
    private javax.swing.JPanel inputRFPanel;
    private javax.swing.JTextField inputRFTF;
    private javax.swing.JScrollPane routeFareListSP;
    private javax.swing.JTable routeFareTable;
    // End of variables declaration//GEN-END:variables
}
