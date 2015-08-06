package server;


import clientonline.BookedSeats;
import clientonline.Registration;
import clientonline.TrainData;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import multimedia.Images;

public class CentralServer extends javax.swing.JFrame {

    public CentralServer() {
        initComponents();
        new Server();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newsFrame = new javax.swing.JFrame();
        newsSP = new javax.swing.JScrollPane();
        newsTA = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        ServerSP = new javax.swing.JScrollPane();
        serverPanel = new javax.swing.JPanel();
        msgPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        newsButton = new javax.swing.JButton();
        serverLogSP = new javax.swing.JScrollPane();
        serverLogTA = new javax.swing.JTextArea();
        clientSP = new javax.swing.JScrollPane();
        clientList = new javax.swing.JList();

        newsFrame.setTitle("Breaking News");
        newsFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        newsTA.setColumns(20);
        newsTA.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        newsTA.setRows(5);
        newsTA.setText("\n\n\n\n                No Breaking News.");
        newsSP.setViewportView(newsTA);

        sendButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newsFrameLayout = new javax.swing.GroupLayout(newsFrame.getContentPane());
        newsFrame.getContentPane().setLayout(newsFrameLayout);
        newsFrameLayout.setHorizontalGroup(
            newsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newsSP)
                .addContainerGap())
            .addGroup(newsFrameLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(sendButton)
                .addGap(163, 163, 163))
        );
        newsFrameLayout.setVerticalGroup(
            newsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newsSP, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(sendButton)
                .addGap(10, 10, 10))
        );

        newsFrame.setLocationRelativeTo(null);
        newsFrame.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CentralServer");
        setExtendedState(6);
        setIconImage(new Images().getFlag());
        setName("server"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 40)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 102, 51));
        welcomeLabel.setText("   Welcome To Bangladesh Railway Central Server");

        newsButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        newsButton.setText("Breaking News");
        newsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout msgPanelLayout = new javax.swing.GroupLayout(msgPanel);
        msgPanel.setLayout(msgPanelLayout);
        msgPanelLayout.setHorizontalGroup(
            msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(welcomeLabel)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgPanelLayout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(newsButton)
                .addGap(394, 394, 394))
        );
        msgPanelLayout.setVerticalGroup(
            msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(welcomeLabel)
                .addGap(30, 30, 30)
                .addComponent(newsButton)
                .addContainerGap())
        );

        serverLogTA.setEditable(false);
        serverLogTA.setColumns(20);
        serverLogTA.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        serverLogTA.setRows(5);
        serverLogSP.setViewportView(serverLogTA);

        clientList.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        clientSP.setViewportView(clientList);

        javax.swing.GroupLayout serverPanelLayout = new javax.swing.GroupLayout(serverPanel);
        serverPanel.setLayout(serverPanelLayout);
        serverPanelLayout.setHorizontalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(serverPanelLayout.createSequentialGroup()
                        .addComponent(serverLogSP)
                        .addGap(20, 20, 20)
                        .addComponent(clientSP, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        serverPanelLayout.setVerticalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(msgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverLogSP, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(clientSP))
                .addGap(10, 10, 10))
        );

        ServerSP.setViewportView(serverPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ServerSP, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ServerSP, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answer = JOptionPane.showConfirmDialog(null, "Want To Exit ?");
        if (answer == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void newsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsButtonActionPerformed
        newsFrame.setVisible(true);
    }//GEN-LAST:event_newsButtonActionPerformed

    private BreakingNews news = new BreakingNews("No Breaking News.");
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        newsFrame.setVisible(false);
        news = new BreakingNews(newsTA.getText());
    }//GEN-LAST:event_sendButtonActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentralServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ServerSP;
    private javax.swing.JList clientList;
    private javax.swing.JScrollPane clientSP;
    private javax.swing.JPanel msgPanel;
    private javax.swing.JButton newsButton;
    private javax.swing.JFrame newsFrame;
    private javax.swing.JScrollPane newsSP;
    private javax.swing.JTextArea newsTA;
    private javax.swing.JButton sendButton;
    private javax.swing.JScrollPane serverLogSP;
    private javax.swing.JTextArea serverLogTA;
    private javax.swing.JPanel serverPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private void connectionFailure(){
        String msg = "Connection cannot be established.";
        JOptionPane.showMessageDialog(null, msg);
        serverLogTA.append(msg + " at "+ new Date()+"\n");       
    }

    private class Server{
        private final ArrayList <String> clients = new ArrayList();
        
        private String[] client;
        private int clientNo = 1;
        private final int port = 2012;
        private final int backlog = 50;
        private final String address = "127.0.0.1";
        
        public Server() {
            
            Thread serverThread = new Thread(){
            @Override
            public void run(){
                File bookedFolder = new File("ServerData\\BookedData");
                File clientFolder = new File("ServerData\\ClientData");
                if (!bookedFolder.exists())
                    bookedFolder.mkdirs();
                if (!clientFolder.exists())
                    clientFolder.mkdirs();
                
            try {
                serverLogTA.append(new Date() + "\n---------------SERVER-------------\n");
                serverLogTA.append("Binding to port " + port + ", please wait  ...\n");
                InetAddress ip = InetAddress.getByName(address);
                ServerSocket server = new ServerSocket(port, backlog, ip);
                serverLogTA.append("Server started at " + new Date() +"\n"+ server +"\n");
                serverLogTA.append("Waiting for a client ...\n"); 
                while (true){
                    Socket socket = server.accept();
                    SingleClient singleClient = new SingleClient(socket);
                    new Thread(singleClient).start();
                    clientNo++;
                }
            } catch (IOException ex) {
                connectionFailure();
            }}};
            serverThread.start();
        }
        
        
        private class SingleClient implements Runnable{
            private final Socket socket;
            public SingleClient(Socket socket) {
                this.socket = socket;
            }  
            @Override
            public void run() {
                new InputFromClient(socket);
            }
            
        }  
        private BookedSeats seatList;

        private class InputFromClient implements Runnable{
            private ObjectInputStream inputFromClient;
            private Socket socket;

            public InputFromClient(Socket clientSocket) {
                try {
                    Thread inThread = new Thread(this);
                    socket = clientSocket;
                    BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                    inputFromClient = new ObjectInputStream(bis);
                    inThread.start();
                } catch (IOException ex) {
                    connectionFailure();
                }
            }
            private Registration clientData;
            private TrainData  trainData;
            private BookedSeats bookedSeats;
            private String clientName;



            @Override
            public void run() {



            try {
                Object objectCI = inputFromClient.readObject();
                Object objectTI = inputFromClient.readObject();
                
                clientData = (Registration) objectCI;
                trainData = (TrainData) objectTI;
                clientName = clientData.getUserName();
                
                String clientHistory = clientData.getUserName()
                +clientData.getPhoneNo()+Arrays.toString(clientData.getPassword());
                readClientHistory(clientHistory);
                
                serverLogTA.append("Connected client "+(clientNo-1)+" : "
                    +clientName+" at "+new Date()+"\n"+socket+"\n");              
                clients.add(clientName);
                makeList();
                
                
                final File bookedFile = new File("ServerData\\BookedData\\"+trainData.getDate()
                +trainData.getTrainNo()+trainData.getSeatClass()+".txt");
                
                readBookedData(bookedFile);
                
                
                
                Object objectBS = inputFromClient.readObject();
                bookedSeats = (BookedSeats) objectBS;
                writeBookedData(bookedFile);
                
                final File clientFile = new File("ServerData\\ClientData\\"+clientData.getUserName()
                +clientData.getPhoneNo()+Arrays.toString(clientData.getPassword())
                        + new Date().toString().replace(':', ' ') + ".txt");
                saveClientData(clientFile);
                
                while (true){
                    inputFromClient.readObject();
                    
                }
                      

            } catch (IOException | ClassNotFoundException ex) {
                clients.remove(clientName);
                makeList();
                serverLogTA.append(clientName+" is Disconnected at "+new Date()+"\n");
            }}

            private void makeList(){
                client = new String[clients.size()];
                client = clients.toArray(client);
                clientList.setModel(new javax.swing.AbstractListModel() {
                    String[] strings = client;
                    public int getSize() { return strings.length; }
                    public Object getElementAt(int i) { return strings[i]; }
                });
            }
          
           private final ArrayList<String> bookedSeatsList = new ArrayList<>();
           private String[] bookedSeatsNo;

           private void readBookedData(File bookedFile){
               String trainNo = trainData.getTrainNo();
               serverLogTA.append(clientName+" is requesting for train no "+trainNo+".\n");

               if (bookedFile.exists()){
                try {
                    BufferedReader br = new BufferedReader(new FileReader(bookedFile));
                    Scanner inputFromFile = new Scanner(br);
                    while (inputFromFile.hasNext()){
                        String nextLine = inputFromFile.nextLine();
                        nextLine = ((nextLine.replace('[', ' ')).replace(']', ' ')).replaceAll("\\s", "");
                        String[] splitLine = nextLine.split(",");
                        bookedSeatsList.addAll(Arrays.asList(splitLine));
                        bookedSeatsNo = new String[bookedSeatsList.size()];
                        bookedSeatsNo = bookedSeatsList.toArray(bookedSeatsNo);
                    }

                }catch (Exception ex) {}}

              seatList = new BookedSeats(bookedSeatsNo, null);  
              new OutputToClient(socket);
              
           }       
           
            
           private void writeBookedData(File bookedFile){
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(bookedFile, true));
                    PrintWriter outputToFile = new PrintWriter(bw, true);
                    String[] seats = bookedSeats.getSeats();
                    outputToFile.println(Arrays.toString(seats));
                    serverLogTA.append(clientName+" has booked "+Arrays.toString(seats)+" no. seats.\n");
                    
                } catch (Exception ex) {}
           }
           
           
           private void saveClientData(File clientFile){
                try {
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(clientFile));
                    ObjectOutputStream outputToFile = new ObjectOutputStream(bos);
                    outputToFile.writeObject(trainData);
                    outputToFile.writeObject(bookedSeats);
                    outputToFile.flush();
                    serverLogTA.append(clientName+" has purchased ticket successfully.\n");                    
                } catch (Exception ex) {}
           }
           
               
           
           private void readClientHistory(String history){
                ArrayList<TrainData> trainHistory = new ArrayList<>();
                ArrayList<BookedSeats> bookedHistory = new ArrayList<>();
        
               File[] files = new File("ServerData\\ClientData").listFiles();
                for (File file : files) {
                if (file.getPath().contains(history)) {
                    try {
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                        ObjectInputStream inputFromFile = new ObjectInputStream(bis);
                        Object objectTH = inputFromFile.readObject();
                        trainHistory.add((TrainData) objectTH);
                        Object objectBH = inputFromFile.readObject();
                        bookedHistory.add((BookedSeats) objectBH);
                    }catch (IOException | ClassNotFoundException ex) {}}}
                
                trainHList = new TrainData[trainHistory.size()];
                trainHList = trainHistory.toArray(trainHList);
        
                bookedHList = new BookedSeats[bookedHistory.size()];
                bookedHList = bookedHistory.toArray(bookedHList);
        
                
         
            }
        }
           
           
          private TrainData [] trainHList;
          private BookedSeats [] bookedHList;
            
        

           
        private class OutputToClient implements Runnable{
            private ObjectOutputStream outputToClient;

            public OutputToClient(Socket socket) {
                try {
                    Thread outThread = new Thread(this);
                    BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                    outputToClient = new ObjectOutputStream(bos);
                    outputToClient.writeObject(news);
                    outputToClient.writeObject(seatList);                    
                    outputToClient.flush();                            
                    outThread.start();

                } catch (IOException ex) {
                    connectionFailure();
                }
            }


            @Override
            public void run() {
                try {
                    outputToClient.writeObject(trainHList);
                    outputToClient.writeObject(bookedHList);
                    outputToClient.flush();
                } catch (IOException ex) {}
                    
                
            }
        }
    }
}