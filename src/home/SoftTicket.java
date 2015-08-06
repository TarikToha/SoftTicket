package home;


import multimedia.MapPanel;
import multimedia.Sounds;
import multimedia.Images;
import clientoffline.TicketPanel;
import clientonline.HistoryPanel;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.Timer;

public class SoftTicket extends JFrame {
    
    public SoftTicket() {
        
        initComponents();
          
    }
      
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bdFrame = new javax.swing.JFrame();
        flagPanel = new javax.swing.JPanel();
        homeSP = new javax.swing.JScrollPane();
        railticketTP = new javax.swing.JTabbedPane();

        bdFrame.setContentPane(new Flag().getFlagFader());
        new Sounds().openingSound();
        bdFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        bdFrame.setTitle("RailTicket");
        bdFrame.setAlwaysOnTop(true);
        bdFrame.setAutoRequestFocus(false);
        bdFrame.setBackground(new java.awt.Color(0, 153, 51));
        bdFrame.setMinimumSize(new java.awt.Dimension(1024, 768));
        bdFrame.setName("flagFrame"); // NOI18N
        bdFrame.setUndecorated(true);
        bdFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdFrameMouseClicked(evt);
            }
        });

        flagPanel.setBackground(new java.awt.Color(0, 106, 78));

        javax.swing.GroupLayout flagPanelLayout = new javax.swing.GroupLayout(flagPanel);
        flagPanel.setLayout(flagPanelLayout);
        flagPanelLayout.setHorizontalGroup(
            flagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        flagPanelLayout.setVerticalGroup(
            flagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bdFrameLayout = new javax.swing.GroupLayout(bdFrame.getContentPane());
        bdFrame.getContentPane().setLayout(bdFrameLayout);
        bdFrameLayout.setHorizontalGroup(
            bdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bdFrameLayout.setVerticalGroup(
            bdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bdFrame.setVisible(true);
        bdFrame.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SoftTicket");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setIconImage(new Images().getIcon());
        setName("mainFrame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowCloser(evt);
            }
        });

        railticketTP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        railticketTP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                railticketTPStateChanged(evt);
            }
        });
        homeSP.setViewportView(railticketTP);
        railticketTP.addTab("Welcome Page",new WelcomePanel());
        railticketTP.addTab("Train Schedule",new TrainSchPanel());
        railticketTP.addTab("Route & Fare",new RouteFarePanel());
        railticketTP.addTab("Purchase Ticket",new TicketPanel());
        railticketTP.addTab("Purchase History",new HistoryPanel());
        railticketTP.addTab("Maps",new MapPanel());
        railticketTP.addTab("About Developers",new AboutPanel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeSP, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeSP, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1040, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bdFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdFrameMouseClicked
        bdFrame.setVisible(false);
    }//GEN-LAST:event_bdFrameMouseClicked

    private void railticketTPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_railticketTPStateChanged
        JTabbedPane tp = (JTabbedPane)evt.getSource();
        int selectedTab = tp.getSelectedIndex();
        Sounds playClip = new Sounds();
        if (selectedTab == tp.indexOfTab("Train Schedule")){
            playClip.schSound();
        }
        else if (selectedTab == tp.indexOfTab("Purchase Ticket")){
            playClip.ticketSound();
        }
            
    }//GEN-LAST:event_railticketTPStateChanged

    private void windowCloser(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowCloser
        int answer = JOptionPane.showConfirmDialog(null, "Want To Exit ?");
        if (answer == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_windowCloser

    public static void main(String args[]) {
        
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SoftTicket().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame bdFrame;
    private javax.swing.JPanel flagPanel;
    private javax.swing.JScrollPane homeSP;
    private javax.swing.JTabbedPane railticketTP;
    // End of variables declaration//GEN-END:variables

    
    class Flag{
        private final Fader flagFader;
        public Flag() {
            flagFader = new Fader();
            
        }

        public Fader getFlagFader() {
            return flagFader;
        }
        
        
        class Fader extends JPanel implements ActionListener{
            private float alpha = 0f;  
            private final float increment = .01f;
            private final Image myImage = new Images().getFlag();
            Timer fader = new Timer(10, this);
            public Fader() {  
                fader.start();             
            }
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                g2d.drawImage(myImage, 240, 40, null);

            }
            @Override
            public void actionPerformed(ActionEvent e) {  
                alpha += increment;
                if (alpha>=1f){
                    fader.stop();
                    bdFrame.setVisible(false);
                }
                repaint();
            }
        }
    }
    
   
}