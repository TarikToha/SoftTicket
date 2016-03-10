package multimedia;

public class MapPanel extends javax.swing.JPanel {

    public MapPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapFrame = new javax.swing.JFrame();
        mapSP = new javax.swing.JScrollPane();
        mapButtonsP = new javax.swing.JPanel();
        railMapB = new javax.swing.JButton();
        transportMapB = new javax.swing.JButton();
        normalMapB = new javax.swing.JButton();
        largeMapB = new javax.swing.JButton();

        mapFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        mapFrame.setTitle("Maps");
        mapFrame.setBackground(new java.awt.Color(255, 255, 255));
        mapFrame.setExtendedState(6);
        mapFrame.setIconImage(new Images().getBdImage());
        mapFrame.setMinimumSize(new java.awt.Dimension(1024, 512));
        mapFrame.setName("mapFrame"); // NOI18N

        mapSP.setBackground(new java.awt.Color(255, 255, 255));
        mapSP.setBorder(null);

        javax.swing.GroupLayout mapFrameLayout = new javax.swing.GroupLayout(mapFrame.getContentPane());
        mapFrame.getContentPane().setLayout(mapFrameLayout);
        mapFrameLayout.setHorizontalGroup(
            mapFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapSP, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        mapFrameLayout.setVerticalGroup(
            mapFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapSP, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        mapSP.setSize(1024, 704);

        railMapB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        railMapB.setText("Rail Map");
        railMapB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                railMapBActionPerformed(evt);
            }
        });

        transportMapB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        transportMapB.setText("Transport Map");
        transportMapB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportMapBActionPerformed(evt);
            }
        });

        normalMapB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        normalMapB.setText("Normal Map");
        normalMapB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalMapBActionPerformed(evt);
            }
        });

        largeMapB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        largeMapB.setText("Large Map");
        largeMapB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeMapBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mapButtonsPLayout = new javax.swing.GroupLayout(mapButtonsP);
        mapButtonsP.setLayout(mapButtonsPLayout);
        mapButtonsPLayout.setHorizontalGroup(
            mapButtonsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapButtonsPLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(railMapB)
                .addGap(100, 100, 100)
                .addComponent(transportMapB)
                .addGap(109, 109, 109)
                .addComponent(normalMapB)
                .addGap(87, 87, 87)
                .addComponent(largeMapB)
                .addGap(88, 88, 88))
        );
        mapButtonsPLayout.setVerticalGroup(
            mapButtonsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapButtonsPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(mapButtonsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(railMapB)
                    .addComponent(transportMapB)
                    .addComponent(normalMapB)
                    .addComponent(largeMapB)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(mapButtonsP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(mapButtonsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(560, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void railMapBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_railMapBActionPerformed
        Thread thread = new Thread(){
            @Override
            public void run(){
                mapSP.getViewport().add(new Images().getRailMap());
                mapFrame.setVisible(true);
            }};
        thread.start();
    }//GEN-LAST:event_railMapBActionPerformed

    private void transportMapBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportMapBActionPerformed
        Thread thread = new Thread(){
            @Override
            public void run(){
                mapSP.getViewport().add(new Images().getTransportMap());
                mapFrame.setVisible(true);
            }};
        thread.start();
    }//GEN-LAST:event_transportMapBActionPerformed

    private void normalMapBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalMapBActionPerformed
        Thread thread = new Thread(){
            @Override
            public void run(){
                mapSP.getViewport().add(new Images().getNormalMap());
                mapFrame.setVisible(true);
            }};
        thread.start();
    }//GEN-LAST:event_normalMapBActionPerformed

    private void largeMapBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeMapBActionPerformed
        Thread thread = new Thread(){
            @Override
            public void run(){
                mapFrame.setVisible(true);
                mapSP.getViewport().add(new Images().getLargeMap());
            }};
        thread.start();
    }//GEN-LAST:event_largeMapBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton largeMapB;
    private javax.swing.JPanel mapButtonsP;
    private javax.swing.JFrame mapFrame;
    private javax.swing.JScrollPane mapSP;
    private javax.swing.JButton normalMapB;
    private javax.swing.JButton railMapB;
    private javax.swing.JButton transportMapB;
    // End of variables declaration//GEN-END:variables
}
