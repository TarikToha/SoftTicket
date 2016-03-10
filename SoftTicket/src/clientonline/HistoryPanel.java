package clientonline;

import clientoffline.TicketPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import multimedia.Images;

public class HistoryPanel extends javax.swing.JPanel {

    public HistoryPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regFrame = new javax.swing.JFrame();
        regPanel = new javax.swing.JPanel();
        userNameL = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        phoneNoL = new javax.swing.JLabel();
        phoneNoTF = new javax.swing.JTextField();
        passwordL = new javax.swing.JLabel();
        passwordPF = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        ticketFrame = new javax.swing.JFrame();
        ticketVSP = new javax.swing.JScrollPane();
        ticketL = new javax.swing.JLabel();
        ticketViewP = new javax.swing.JPanel();
        railLabel = new javax.swing.JLabel();
        trainNoLabel = new javax.swing.JLabel();
        trainNoTF = new javax.swing.JTextField();
        trainNameL = new javax.swing.JLabel();
        trainNameTF = new javax.swing.JTextField();
        sfromL = new javax.swing.JLabel();
        sfromTF = new javax.swing.JTextField();
        stoLabel = new javax.swing.JLabel();
        stoTF = new javax.swing.JTextField();
        jdateLabel = new javax.swing.JLabel();
        jdateTF = new javax.swing.JTextField();
        deptimeLabel = new javax.swing.JLabel();
        deptimeTF = new javax.swing.JTextField();
        classL = new javax.swing.JLabel();
        classTF = new javax.swing.JTextField();
        seatNoLabel = new javax.swing.JLabel();
        seatNoTF = new javax.swing.JTextField();
        fareLabel = new javax.swing.JLabel();
        fareTF = new javax.swing.JTextField();
        historyButton = new javax.swing.JButton();
        ticketSP = new javax.swing.JScrollPane();
        ticketList = new javax.swing.JList();
        ticketButton = new javax.swing.JButton();

        regFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        regFrame.setTitle("Registration");
        regFrame.setIconImage(new Images().getIcon());
        regFrame.setMinimumSize(new java.awt.Dimension(450, 350));
        regFrame.setName("regFrame"); // NOI18N
        regFrame.setResizable(false);

        userNameL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        userNameL.setText("User Name :");

        userNameTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        userNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        phoneNoL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        phoneNoL.setText("Phone No.  :");

        phoneNoTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        phoneNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passwordL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        passwordL.setText("Password    :");

        passwordPF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        passwordPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        registerButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        registerButton.setText("Done");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, regPanelLayout.createSequentialGroup()
                        .addComponent(userNameL)
                        .addGap(60, 60, 60)
                        .addComponent(userNameTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, regPanelLayout.createSequentialGroup()
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNoL)
                            .addComponent(passwordL))
                        .addGap(60, 60, 60)
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(passwordPF))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerButton)
                .addGap(87, 87, 87))
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameL)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoL))
                .addGap(30, 30, 30)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordL)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(registerButton)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout regFrameLayout = new javax.swing.GroupLayout(regFrame.getContentPane());
        regFrame.getContentPane().setLayout(regFrameLayout);
        regFrameLayout.setHorizontalGroup(
            regFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regFrameLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        regFrameLayout.setVerticalGroup(
            regFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regFrameLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        regFrame.setLocationRelativeTo(null);
        regFrame.setVisible(false);

        ticketFrame.setTitle("TicketView");
        ticketFrame.setBackground(new java.awt.Color(255, 255, 255));
        ticketFrame.setExtendedState(6);
        ticketFrame.setMinimumSize(new java.awt.Dimension(1024, 768));
        ticketFrame.setName("ticket"); // NOI18N

        ticketVSP.setBackground(new java.awt.Color(255, 255, 255));
        ticketVSP.setViewportView(ticketL);

        ticketFrame.setVisible(false);

        javax.swing.GroupLayout ticketFrameLayout = new javax.swing.GroupLayout(ticketFrame.getContentPane());
        ticketFrame.getContentPane().setLayout(ticketFrameLayout);
        ticketFrameLayout.setHorizontalGroup(
            ticketFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ticketVSP, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        ticketFrameLayout.setVerticalGroup(
            ticketFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ticketVSP, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        ticketViewP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        railLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        railLabel.setText("Bangladesh Railway Intercity Service");

        trainNoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        trainNoLabel.setText("Train No               :");

        trainNoTF.setEditable(false);
        trainNoTF.setBackground(new java.awt.Color(255, 255, 255));
        trainNoTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        trainNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trainNameL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        trainNameL.setText("Name of Train      :");

        trainNameTF.setEditable(false);
        trainNameTF.setBackground(new java.awt.Color(255, 255, 255));
        trainNameTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        trainNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sfromL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sfromL.setText("Station From        :");

        sfromTF.setEditable(false);
        sfromTF.setBackground(new java.awt.Color(255, 255, 255));
        sfromTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        sfromTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        stoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        stoLabel.setText("Station To             :");

        stoTF.setEditable(false);
        stoTF.setBackground(new java.awt.Color(255, 255, 255));
        stoTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        stoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jdateLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jdateLabel.setText("Journey Date        :");

        jdateTF.setEditable(false);
        jdateTF.setBackground(new java.awt.Color(255, 255, 255));
        jdateTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jdateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        deptimeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        deptimeLabel.setText("Departure Time    :");

        deptimeTF.setEditable(false);
        deptimeTF.setBackground(new java.awt.Color(255, 255, 255));
        deptimeTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        deptimeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        classL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        classL.setText("Class                      :");

        classTF.setEditable(false);
        classTF.setBackground(new java.awt.Color(255, 255, 255));
        classTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        classTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        seatNoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        seatNoLabel.setText("Seat No                 :");

        seatNoTF.setEditable(false);
        seatNoTF.setBackground(new java.awt.Color(255, 255, 255));
        seatNoTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        seatNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fareLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fareLabel.setText("Fare                       :");

        fareTF.setEditable(false);
        fareTF.setBackground(new java.awt.Color(255, 255, 255));
        fareTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        fareTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout ticketViewPLayout = new javax.swing.GroupLayout(ticketViewP);
        ticketViewP.setLayout(ticketViewPLayout);
        ticketViewPLayout.setHorizontalGroup(
            ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketViewPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateLabel)
                    .addComponent(deptimeLabel)
                    .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(railLabel)
                            .addComponent(fareLabel)
                            .addComponent(seatNoLabel)
                            .addComponent(classL)
                            .addComponent(stoLabel)
                            .addComponent(sfromL)
                            .addComponent(trainNameL))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ticketViewPLayout.createSequentialGroup()
                            .addComponent(trainNoLabel)
                            .addGap(40, 40, 40)
                            .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trainNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(classTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deptimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sfromTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trainNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fareTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        ticketViewPLayout.setVerticalGroup(
            ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketViewPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(railLabel)
                .addGap(20, 20, 20)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainNoLabel))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainNameL)
                    .addComponent(trainNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sfromL)
                    .addComponent(sfromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoLabel)
                    .addComponent(stoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdateLabel)
                    .addComponent(jdateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptimeLabel)
                    .addComponent(deptimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classL)
                    .addComponent(classTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatNoLabel)
                    .addComponent(seatNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ticketViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fareLabel)
                    .addComponent(fareTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        historyButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        historyButton.setText("Show History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        ticketList.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ticketList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ticketList.setVisibleRowCount(15);
        ticketSP.setViewportView(ticketList);
        ticketList.setVisible(false);
        ListSelectionModel lsm = ticketList.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionHandler());

        ticketButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        ticketButton.setText("Show Ticket");
        ticketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(historyButton)
                    .addComponent(ticketSP, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticketViewP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticketButton))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historyButton)
                    .addComponent(ticketButton))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ticketViewP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ticketSP))
                .addGap(236, 236, 236))
        );

        ticketViewP.setVisible(false);
        ticketButton.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
       regFrame.setVisible(true);
    }//GEN-LAST:event_historyButtonActionPerformed
       
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String userName = userNameTF.getText();
        String phoneNo = phoneNoTF.getText();
        char[] password = passwordPF.getPassword();
        String temp = new String(password);
        if (!userName.trim().isEmpty() && !phoneNo.trim().isEmpty() && !temp.trim().isEmpty()){
            clientData = new Registration(userName, phoneNo, password);
            regFrame.setVisible(false);
            showHistory();
        }
        else
            JOptionPane.showMessageDialog(null, "Please enter valid information.");

    }//GEN-LAST:event_registerButtonActionPerformed

    private void ticketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketButtonActionPerformed
        viewTicket();
    }//GEN-LAST:event_ticketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classL;
    private javax.swing.JTextField classTF;
    private javax.swing.JLabel deptimeLabel;
    private javax.swing.JTextField deptimeTF;
    private javax.swing.JLabel fareLabel;
    private javax.swing.JTextField fareTF;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jdateLabel;
    private javax.swing.JTextField jdateTF;
    private javax.swing.JLabel passwordL;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JLabel phoneNoL;
    private javax.swing.JTextField phoneNoTF;
    private javax.swing.JLabel railLabel;
    private javax.swing.JFrame regFrame;
    private javax.swing.JPanel regPanel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel seatNoLabel;
    private javax.swing.JTextField seatNoTF;
    private javax.swing.JLabel sfromL;
    private javax.swing.JTextField sfromTF;
    private javax.swing.JLabel stoLabel;
    private javax.swing.JTextField stoTF;
    private javax.swing.JButton ticketButton;
    private javax.swing.JFrame ticketFrame;
    private javax.swing.JLabel ticketL;
    private javax.swing.JList ticketList;
    private javax.swing.JScrollPane ticketSP;
    private javax.swing.JScrollPane ticketVSP;
    private javax.swing.JPanel ticketViewP;
    private javax.swing.JLabel trainNameL;
    private javax.swing.JTextField trainNameTF;
    private javax.swing.JLabel trainNoLabel;
    private javax.swing.JTextField trainNoTF;
    private javax.swing.JLabel userNameL;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables

    private Registration clientData;
    private TrainData  trainData;
    private BookedSeats bookedSeats;
    private String [] list;       
    
    private void showHistory() {
        File dir = new File("Ticket History");
        if (dir.exists()){
            String name = clientData.getUserName()
                +clientData.getPhoneNo()+Arrays.toString(clientData.getPassword());
                    
                
            File[] files = dir.listFiles();
            ArrayList<String> filesList = new ArrayList<>();
            for (File file : files) {
                if (file.getName().contains(name)) {
                    filesList.add(file.getName());
                }
            }
            if (!filesList.isEmpty()){           
                list = new String[filesList.size()];
                list = filesList.toArray(list);
        
            ticketList.setModel(new javax.swing.AbstractListModel() {
                String[] strings = list;
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
            });
            ticketList.setVisible(true);}
            else{
                JOptionPane.showMessageDialog(null, "No History Available.");
            }
        }
    }
    
    
    class ListSelectionHandler implements ListSelectionListener{
        @Override
        public void valueChanged(ListSelectionEvent e) {
            Thread ticketThread = new Thread(){
            @Override
            public void run(){
            String fileName = ticketList.getSelectedValue().toString();
            showTicket(fileName);
            }};
            ticketThread.start();
        }
    }
    
        
        
    private void showTicket(String fileName){
        File file = new File("Ticket History\\"+fileName);
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            ObjectInputStream inputFromFile = new ObjectInputStream(bis);
            Object objectTH = inputFromFile.readObject();
            trainData = (TrainData) objectTH;
            Object objectBH = inputFromFile.readObject();
            bookedSeats = (BookedSeats) objectBH;
            ticketGenerator();
        }catch (IOException | ClassNotFoundException | NullPointerException ex) {
            ticketViewP.setVisible(false);
            JOptionPane.showMessageDialog(null, "Sorry, your ticket cannot be read.");
        }
        
        
    }
    
    private void ticketGenerator(){
        String seatNo = Arrays.toString(bookedSeats.getSeats());
        seatNo = seatNo.replace('[', ' ');
        seatNo = seatNo.replace(']', ' ');
        trainNoTF.setText(trainData.getTrainNo().toUpperCase());
        trainNameTF.setText(trainData.getTrainName().toUpperCase());
        sfromTF.setText(trainData.getFrom().toUpperCase());
        stoTF.setText(trainData.getTo().toUpperCase());
        jdateTF.setText(trainData.getDate().toUpperCase());
        deptimeTF.setText(trainData.getDepartureTime().toUpperCase());
        classTF.setText(trainData.getSeatClass().toUpperCase());
        seatNoTF.setText(seatNo.toUpperCase());
        fareTF.setText(bookedSeats.getFare().toUpperCase());
        ticketViewP.setVisible(true);
        makeTicket();
    }
    
        private String ticketFile;
        
    private void makeTicket(){
        try {
            final BufferedImage image = ImageIO.read(new Images().getTicket());
            
            Graphics g = image.getGraphics();
            
            g.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
            g.setColor(Color.black);
            
            String slNo = Integer.toString(new Random().nextInt(999999999));
            
            g.drawString(slNo,449, 173);
            g.drawString(trainNameTF.getText(), 20, 336);
            g.drawString(trainNoTF.getText(), 610, 336);
            g.drawString(sfromTF.getText(), 70, 456);
            g.drawString(stoTF.getText(), 467, 456);
            g.drawString(jdateTF.getText(), 63, 603);
            g.drawString(deptimeTF.getText(), 584, 603);
            g.drawString(classTF.getText(), 30,748);
            g.drawString(seatNoTF.getText(), 319, 748);
            
            Calendar today = Calendar.getInstance();
            String time = String.format("%1$td-%1$tb-%1$tY   %tR",today);
            
            g.drawString(time, 30, 891);
            g.drawString(fareTF.getText(), 548, 891);
            g.drawString(bookedSeats.getSeats().length+" Adult(s)", 68, 1040);
            g.drawString("TINT8286", 548, 1040);
            g.drawString("CNA"+slNo, 416, 1119);
            g.dispose();
            
            ticketFile = new Date().toString().replace(':', ' ');
            
            ImageIO.write(image, "jpg", new File("Ticket History\\"+ticketFile+".jpg"));
            
            JOptionPane.showMessageDialog(null, "Your Ticket Is Ready To Print.\n"
                    + "Check Ticket History Directory.");
            
            
            viewTicket();
        
        } catch (IOException ex) {}
        
        
    }
    
    
    private void viewTicket(){
        ImageIcon ticket = new ImageIcon("Ticket History\\"+ticketFile+".jpg");
        ticketL.setIcon(ticket);
        ticketFrame.setVisible(true);
        ticketButton.setVisible(true);
    }
    
}