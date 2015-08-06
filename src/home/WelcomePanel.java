package home;

import multimedia.Images;

public class WelcomePanel extends javax.swing.JPanel {

    public WelcomePanel(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgPanel = new javax.swing.JPanel();
        msgLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        picPanel = new javax.swing.JPanel();
        mapPanel = new javax.swing.JPanel();
        mapLabel = new javax.swing.JLabel();
        picFrame = new javax.swing.JInternalFrame();
        descPanel = new javax.swing.JPanel();
        eLabel1 = new javax.swing.JLabel();
        eLabel2 = new javax.swing.JLabel();
        eLabel3 = new javax.swing.JLabel();
        eLabel4 = new javax.swing.JLabel();
        eLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        msgPanel.setBackground(new java.awt.Color(255, 255, 255));

        msgLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 80)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(0, 102, 51));
        msgLabel.setText(" Bangladesh Railway");

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setText(" ");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logoLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addComponent(logoLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        logoLabel.setIcon(new Images().getLogo());

        javax.swing.GroupLayout msgPanelLayout = new javax.swing.GroupLayout(msgPanel);
        msgPanel.setLayout(msgPanelLayout);
        msgPanelLayout.setHorizontalGroup(
            msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msgLabel)
                .addGap(75, 75, 75))
        );
        msgPanelLayout.setVerticalGroup(
            msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel))
                .addGap(10, 10, 10))
        );

        picPanel.setBackground(new java.awt.Color(255, 255, 255));

        mapPanel.setBackground(new java.awt.Color(255, 255, 255));

        mapLabel.setText(" ");

        javax.swing.GroupLayout mapPanelLayout = new javax.swing.GroupLayout(mapPanel);
        mapPanel.setLayout(mapPanelLayout);
        mapPanelLayout.setHorizontalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mapLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mapPanelLayout.setVerticalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapPanelLayout.createSequentialGroup()
                .addComponent(mapLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mapLabel.setIcon(new Images().getHomeMap());

        javax.swing.plaf.InternalFrameUI ifu= picFrame.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
        picFrame.setContentPane(new Images().getSlideShow().getPicture());
        picFrame.setBackground(new java.awt.Color(255, 255, 255));
        picFrame.setBorder(null);
        picFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        picFrame.setMinimumSize(new java.awt.Dimension(660, 400));
        picFrame.setVisible(true);

        javax.swing.GroupLayout picFrameLayout = new javax.swing.GroupLayout(picFrame.getContentPane());
        picFrame.getContentPane().setLayout(picFrameLayout);
        picFrameLayout.setHorizontalGroup(
            picFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        picFrameLayout.setVerticalGroup(
            picFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout picPanelLayout = new javax.swing.GroupLayout(picPanel);
        picPanel.setLayout(picPanelLayout);
        picPanelLayout.setHorizontalGroup(
            picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(picFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        picPanelLayout.setVerticalGroup(
            picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        descPanel.setBackground(new java.awt.Color(255, 255, 255));

        eLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        eLabel1.setForeground(new java.awt.Color(51, 153, 0));
        eLabel1.setText("                Welcome To Bangladesh Railway Ticket Reservation Software            ");

        eLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        eLabel2.setText("Purchasing tickets through Internet is another convenient way to travel with Bangladesh Railway. Register yourself");

        eLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        eLabel3.setText("with your cell phone number,  book online and your ticket details  will  then  be  confirmed to  you  in your mobile");

        eLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        eLabel4.setText("after payment through your bKash account. Your ticket will be generated within 5 minutes.  You  have  to  print  it.");

        eLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        eLabel5.setText(" Have a nice journey !                                                                                                                                         Thank You.");

        javax.swing.GroupLayout descPanelLayout = new javax.swing.GroupLayout(descPanel);
        descPanel.setLayout(descPanelLayout);
        descPanelLayout.setHorizontalGroup(
            descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(descPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(eLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eLabel5))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        descPanelLayout.setVerticalGroup(
            descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
            .addGroup(descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(descPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(eLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eLabel5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(msgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(descPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(picPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(msgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(picPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(descPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel descPanel;
    private javax.swing.JLabel eLabel1;
    private javax.swing.JLabel eLabel2;
    private javax.swing.JLabel eLabel3;
    private javax.swing.JLabel eLabel4;
    private javax.swing.JLabel eLabel5;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel mapLabel;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JPanel msgPanel;
    private javax.swing.JInternalFrame picFrame;
    private javax.swing.JPanel picPanel;
    // End of variables declaration//GEN-END:variables
}
