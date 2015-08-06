package clientoffline;


import clientonline.ACBerthBPanel;
import clientonline.ACChairBPanel;
import clientonline.BookedSeats;
import clientonline.Registration;
import clientonline.SeatPanel;
import clientonline.ShovonBPanel;
import clientonline.TrainData;
import home.SchTable;
import multimedia.Images;
import home.RouteFareList;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import server.BreakingNews;


public class TicketPanel extends javax.swing.JPanel implements ActionListener  {
    private String From, Off_Day, ToList;
    private String sDate, sFrom, sTo, sSeatClass, sTrainNo, sTrainName, sDepartureTime;
    
    public TicketPanel() {
        initComponents();
    }

    private String [] toListGenerator(){
        ToListGenerator tlg = new ToListGenerator(Off_Day, From);

        return tlg.getToList();
    }
    private void trainListGenerator(){
        Thread thread = new Thread(){
            @Override
            public void run(){
        
        TrainListGenerator classList = new TrainListGenerator(Off_Day, From, ToList);
        String[] combList = classList.getCombinedClassList();
        
        for (String combList1 : combList) {
            if (null != combList1)
                switch (combList1) {
                case "AC_Berth":
                    acberthRB.setVisible(true);
                    break;
                case "AC_Seat":
                    acseatRB.setVisible(true);
                    break;
                case "Snigdha":
                    snigdhaRB.setVisible(true);
                    break;
                case "F_Berth":
                    fberthRB.setVisible(true);
                    break;
                case "F_Seat":
                    fseatRB.setVisible(true);
                    break;
                case "F_Chair":
                    fchairRB.setVisible(true);
                    break;
                case "S_Chair":
                    schairRB.setVisible(true);
                    break;
                case "Shovon":
                    shovonRB.setVisible(true);
                    break;
                case "Shulov":
                    shulovRB.setVisible(true);
                    break;
            }
        }
            }
        };
        thread.start();
    }
 
    private void nullClass(){
        classBG.clearSelection();
        searchTrainButton.setVisible(false);
        acLabel.setVisible(false);
        fLabel.setVisible(false);
        sLabel.setVisible(false);
        acberthRB.setVisible(false);
        acseatRB.setVisible(false);
        snigdhaRB.setVisible(false);
        fberthRB.setVisible(false);
        fseatRB.setVisible(false);
        fchairRB.setVisible(false);
        schairRB.setVisible(false);
        shovonRB.setVisible(false);
        shulovRB.setVisible(false);
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromBG = new javax.swing.ButtonGroup();
        classBG = new javax.swing.ButtonGroup();
        regFrame = new javax.swing.JFrame();
        regPanel = new javax.swing.JPanel();
        userNameL = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        phoneNoL = new javax.swing.JLabel();
        phoneNoTF = new javax.swing.JTextField();
        passwordL = new javax.swing.JLabel();
        passwordPF = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        seatPlanFrame = new javax.swing.JFrame();
        classNameTF = new javax.swing.JTextField();
        doneButton = new javax.swing.JButton();
        seatPlanSP = new javax.swing.JScrollPane();
        newsFrame = new javax.swing.JFrame();
        newsSP = new javax.swing.JScrollPane();
        newsTA = new javax.swing.JTextArea();
        dftsPanel = new javax.swing.JPanel();
        datePanel = new javax.swing.JPanel();
        dateButton = new javax.swing.JButton();
        dateListSP = new javax.swing.JScrollPane();
        dateList = new javax.swing.JList();
        fromPanel = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        dhakaRB = new javax.swing.JRadioButton();
        bimanbandarRB = new javax.swing.JRadioButton();
        rajshahiRB = new javax.swing.JRadioButton();
        sylhetRB = new javax.swing.JRadioButton();
        khulnaRB = new javax.swing.JRadioButton();
        chittagongRB = new javax.swing.JRadioButton();
        toPanel = new javax.swing.JPanel();
        toListSP = new javax.swing.JScrollPane();
        toList = new javax.swing.JList();
        toLabel = new javax.swing.JLabel();
        seatPanel = new javax.swing.JPanel();
        classSP = new javax.swing.JScrollPane();
        classPanel = new javax.swing.JPanel();
        acLabel = new javax.swing.JLabel();
        acberthRB = new javax.swing.JRadioButton();
        acseatRB = new javax.swing.JRadioButton();
        snigdhaRB = new javax.swing.JRadioButton();
        fLabel = new javax.swing.JLabel();
        fberthRB = new javax.swing.JRadioButton();
        fseatRB = new javax.swing.JRadioButton();
        fchairRB = new javax.swing.JRadioButton();
        sLabel = new javax.swing.JLabel();
        schairRB = new javax.swing.JRadioButton();
        shovonRB = new javax.swing.JRadioButton();
        shulovRB = new javax.swing.JRadioButton();
        searchTrainButton = new javax.swing.JButton();
        classLabel = new javax.swing.JLabel();
        trainListPanel = new javax.swing.JPanel();
        selectedPanel = new javax.swing.JPanel();
        selectedLabel = new javax.swing.JLabel();
        sDateLabel = new javax.swing.JLabel();
        sFromLabel = new javax.swing.JLabel();
        sToLabel = new javax.swing.JLabel();
        sClassLabel = new javax.swing.JLabel();
        sDateTF = new javax.swing.JTextField();
        sFromTF = new javax.swing.JTextField();
        sToTF = new javax.swing.JTextField();
        sClassTF = new javax.swing.JTextField();
        backdftsB = new javax.swing.JButton();
        rfButton = new javax.swing.JButton();
        onlineButton = new javax.swing.JButton();
        trainsPanel = new javax.swing.JPanel();
        availableLabel = new javax.swing.JLabel();
        trainListSP = new javax.swing.JScrollPane();
        trainListTable = new javax.swing.JTable();
        detailsPanel = new javax.swing.JPanel();
        sRFPanel = new javax.swing.JPanel();
        sRFLabel = new javax.swing.JLabel();
        sTrainNoTF = new javax.swing.JTextField();
        backListB = new javax.swing.JButton();
        sRFSP = new javax.swing.JScrollPane();
        sRFTable = new javax.swing.JTable();
        onlinePanel = new javax.swing.JPanel();
        oselPanel = new javax.swing.JPanel();
        oselLabel = new javax.swing.JLabel();
        osDateLabel = new javax.swing.JLabel();
        osDateTF = new javax.swing.JTextField();
        osFromLabel = new javax.swing.JLabel();
        osFromTF = new javax.swing.JTextField();
        osToLabel = new javax.swing.JLabel();
        osToTF = new javax.swing.JTextField();
        osClassLabel = new javax.swing.JLabel();
        osClassTF = new javax.swing.JTextField();
        osTrainNoL = new javax.swing.JLabel();
        osTrainNoTF = new javax.swing.JTextField();
        backOLB = new javax.swing.JButton();
        connectB = new javax.swing.JButton();
        osSeatNoL = new javax.swing.JLabel();
        seatListSP = new javax.swing.JScrollPane();
        seatList = new javax.swing.JList();
        osFareL = new javax.swing.JLabel();
        osFareTF = new javax.swing.JTextField();
        seatPlanB = new javax.swing.JButton();
        purchaseButton = new javax.swing.JButton();
        newsButton = new javax.swing.JButton();
        clientLogSP = new javax.swing.JScrollPane();
        clientLogTA = new javax.swing.JTextArea();
        finalPanel = new javax.swing.JPanel();
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
        stepsLabel = new javax.swing.JLabel();
        s1Label = new javax.swing.JLabel();
        s2Label = new javax.swing.JLabel();
        s3Label = new javax.swing.JLabel();
        s4Label = new javax.swing.JLabel();
        s5Label = new javax.swing.JLabel();

        fromBG.add(dhakaRB);
        fromBG.add(bimanbandarRB);
        fromBG.add(rajshahiRB);
        fromBG.add(sylhetRB);
        fromBG.add(khulnaRB);
        fromBG.add(chittagongRB);

        classBG.add(acberthRB);
        classBG.add(acseatRB);
        classBG.add(snigdhaRB);
        classBG.add(fberthRB);
        classBG.add(fseatRB);
        classBG.add(fchairRB);
        classBG.add(schairRB);
        classBG.add(shovonRB);
        classBG.add(shulovRB);

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

        seatPlanFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        seatPlanFrame.setTitle("Seat Plan");
        seatPlanFrame.setExtendedState(6);
        seatPlanFrame.setIconImage(new Images().getIcon());
        seatPlanFrame.setMinimumSize(new java.awt.Dimension(1024, 768));
        seatPlanFrame.setName("seatPlan"); // NOI18N

        classNameTF.setEditable(false);
        classNameTF.setBackground(new java.awt.Color(255, 255, 255));
        classNameTF.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        classNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        classNameTF.setText("Class Name");

        doneButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        seatPlanSP.setBorder(null);
        seatPlanSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        seatPlanSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout seatPlanFrameLayout = new javax.swing.GroupLayout(seatPlanFrame.getContentPane());
        seatPlanFrame.getContentPane().setLayout(seatPlanFrameLayout);
        seatPlanFrameLayout.setHorizontalGroup(
            seatPlanFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPlanFrameLayout.createSequentialGroup()
                .addGroup(seatPlanFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatPlanFrameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(seatPlanSP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatPlanFrameLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(classNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                        .addComponent(doneButton)))
                .addGap(10, 10, 10))
        );
        seatPlanFrameLayout.setVerticalGroup(
            seatPlanFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPlanFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(seatPlanFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneButton))
                .addGap(50, 50, 50)
                .addComponent(seatPlanSP, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        seatPlanFrame.setVisible(false);

        newsFrame.setTitle("Breaking News");
        newsFrame.setAlwaysOnTop(true);
        newsFrame.setMinimumSize(new java.awt.Dimension(400, 300));
        newsFrame.setName("news"); // NOI18N

        newsTA.setEditable(false);
        newsTA.setColumns(20);
        newsTA.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        newsTA.setRows(5);
        newsTA.setText("\n\n\n\n                No Breaking News.");
        newsSP.setViewportView(newsTA);

        javax.swing.GroupLayout newsFrameLayout = new javax.swing.GroupLayout(newsFrame.getContentPane());
        newsFrame.getContentPane().setLayout(newsFrameLayout);
        newsFrameLayout.setHorizontalGroup(
            newsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(newsSP, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        newsFrameLayout.setVerticalGroup(
            newsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(newsSP, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        newsFrame.setLocationRelativeTo(null);
        newsFrame.setVisible(false);

        setLayout(new java.awt.CardLayout());

        dateButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        dateButton.setText("Journey Date");
        dateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateButtonActionPerformed(evt);
            }
        });

        dateList.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        dateList.setModel(new javax.swing.AbstractListModel() {
            DateList d = new DateList();
            String[] strings = d.getDate_List();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        dateList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        dateList.setVisibleRowCount(10);
        dateList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dateListValueChanged(evt);
            }
        });
        dateListSP.setViewportView(dateList);
        ListSelectionModel lsm = dateList.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionHandler());
        dateList.setVisible(false);

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(dateButton)
                .addGap(45, 45, 45))
            .addGroup(datePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dateListSP)
                .addGap(10, 10, 10))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dateButton)
                .addGap(35, 35, 35)
                .addComponent(dateListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        fromLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        fromLabel.setText("Station From :");

        dhakaRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        dhakaRB.setText("Dhaka");
        dhakaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dhakaRBActionPerformed(evt);
            }
        });

        bimanbandarRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bimanbandarRB.setText("Biman_Bandar");
        bimanbandarRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimanbandarRBActionPerformed(evt);
            }
        });

        rajshahiRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        rajshahiRB.setText("Rajshahi");
        rajshahiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rajshahiRBActionPerformed(evt);
            }
        });

        sylhetRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        sylhetRB.setText("Sylhet");
        sylhetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sylhetRBActionPerformed(evt);
            }
        });

        khulnaRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        khulnaRB.setText("Khulna");
        khulnaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khulnaRBActionPerformed(evt);
            }
        });

        chittagongRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        chittagongRB.setText("Chittagong");
        chittagongRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chittagongRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel)
                    .addComponent(dhakaRB)
                    .addComponent(bimanbandarRB)
                    .addComponent(rajshahiRB)
                    .addComponent(khulnaRB)
                    .addComponent(chittagongRB)
                    .addComponent(sylhetRB))
                .addGap(20, 20, 20))
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(fromLabel)
                .addGap(35, 35, 35)
                .addComponent(dhakaRB)
                .addGap(30, 30, 30)
                .addComponent(bimanbandarRB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rajshahiRB)
                .addGap(30, 30, 30)
                .addComponent(khulnaRB)
                .addGap(30, 30, 30)
                .addComponent(chittagongRB)
                .addGap(30, 30, 30)
                .addComponent(sylhetRB)
                .addGap(20, 20, 20))
        );

        dhakaRB.addActionListener(this);
        dhakaRB.setVisible(false);
        bimanbandarRB.addActionListener(this);
        bimanbandarRB.setVisible(false);
        rajshahiRB.addActionListener(this);
        rajshahiRB.setVisible(false);
        sylhetRB.addActionListener(this);
        sylhetRB.setVisible(false);
        khulnaRB.addActionListener(this);
        khulnaRB.setVisible(false);
        chittagongRB.addActionListener(this);
        chittagongRB.setVisible(false);

        toList.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        toList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        toList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                toListValueChanged(evt);
            }
        });
        toListSP.setViewportView(toList);
        toList.setVisible(false);

        toLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        toLabel.setText("Station To :");

        javax.swing.GroupLayout toPanelLayout = new javax.swing.GroupLayout(toPanel);
        toPanel.setLayout(toPanelLayout);
        toPanelLayout.setHorizontalGroup(
            toPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(toPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toLabel)
                    .addComponent(toListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        toPanelLayout.setVerticalGroup(
            toPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(toLabel)
                .addGap(30, 30, 30)
                .addComponent(toListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        classSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        classPanel.setBackground(new java.awt.Color(255, 255, 255));

        acLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 17)); // NOI18N
        acLabel.setText("AC Class");

        acberthRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        acberthRB.setText("AC_Berth");
        acberthRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acberthRBActionPerformed(evt);
            }
        });

        acseatRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        acseatRB.setText("AC_Seat");
        acseatRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acseatRBActionPerformed(evt);
            }
        });

        snigdhaRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        snigdhaRB.setText("Snigdha");
        snigdhaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snigdhaRBActionPerformed(evt);
            }
        });

        fLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 17)); // NOI18N
        fLabel.setText("First Class");

        fberthRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        fberthRB.setText("F_Berth");
        fberthRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fberthRBActionPerformed(evt);
            }
        });

        fseatRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        fseatRB.setText("F_Seat");
        fseatRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fseatRBActionPerformed(evt);
            }
        });

        fchairRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        fchairRB.setText("F_Chair");
        fchairRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fchairRBActionPerformed(evt);
            }
        });

        sLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 17)); // NOI18N
        sLabel.setText("Second Class");

        schairRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        schairRB.setText("S_Chair");
        schairRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schairRBActionPerformed(evt);
            }
        });

        shovonRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        shovonRB.setText("Shovon");
        shovonRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shovonRBActionPerformed(evt);
            }
        });

        shulovRB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        shulovRB.setText("Shulov");
        shulovRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shulovRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acberthRB)
                    .addComponent(acseatRB)
                    .addComponent(snigdhaRB)
                    .addComponent(shulovRB)
                    .addComponent(shovonRB)
                    .addComponent(schairRB)
                    .addComponent(sLabel)
                    .addComponent(fchairRB)
                    .addComponent(fseatRB)
                    .addComponent(fberthRB)
                    .addComponent(fLabel))
                .addGap(20, 20, 20))
        );
        classPanelLayout.setVerticalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(acLabel)
                .addGap(15, 15, 15)
                .addComponent(acberthRB)
                .addGap(15, 15, 15)
                .addComponent(acseatRB)
                .addGap(15, 15, 15)
                .addComponent(snigdhaRB)
                .addGap(20, 20, 20)
                .addComponent(fLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(fberthRB)
                .addGap(15, 15, 15)
                .addComponent(fseatRB)
                .addGap(15, 15, 15)
                .addComponent(fchairRB)
                .addGap(20, 20, 20)
                .addComponent(sLabel)
                .addGap(20, 20, 20)
                .addComponent(schairRB)
                .addGap(15, 15, 15)
                .addComponent(shovonRB)
                .addGap(15, 15, 15)
                .addComponent(shulovRB)
                .addGap(20, 20, 20))
        );

        acLabel.setVisible(false);
        acberthRB.setVisible(false);
        acseatRB.setVisible(false);
        snigdhaRB.setVisible(false);
        fLabel.setVisible(false);
        fberthRB.setVisible(false);
        fseatRB.setVisible(false);
        fchairRB.setVisible(false);
        sLabel.setVisible(false);
        schairRB.setVisible(false);
        shovonRB.setVisible(false);
        shulovRB.setVisible(false);

        classSP.setViewportView(classPanel);
        classPanel.setVisible(false);

        searchTrainButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        searchTrainButton.setText("Search Train");
        searchTrainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTrainButtonActionPerformed(evt);
            }
        });

        classLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        classLabel.setText("Seat Class");

        javax.swing.GroupLayout seatPanelLayout = new javax.swing.GroupLayout(seatPanel);
        seatPanel.setLayout(seatPanelLayout);
        seatPanelLayout.setHorizontalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(classLabel))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classSP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTrainButton))))
                .addGap(20, 20, 20))
        );
        seatPanelLayout.setVerticalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(classLabel)
                .addGap(30, 30, 30)
                .addComponent(classSP, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchTrainButton)
                .addGap(20, 20, 20))
        );

        searchTrainButton.setVisible(false);

        javax.swing.GroupLayout dftsPanelLayout = new javax.swing.GroupLayout(dftsPanel);
        dftsPanel.setLayout(dftsPanelLayout);
        dftsPanelLayout.setHorizontalGroup(
            dftsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dftsPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(toPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(seatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        dftsPanelLayout.setVerticalGroup(
            dftsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dftsPanelLayout.createSequentialGroup()
                .addGroup(dftsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        add(dftsPanel, "dftsPanel");

        selectedLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        selectedLabel.setText("You Have Selected :");

        sDateLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        sDateLabel.setText("Date              :");

        sFromLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        sFromLabel.setText("Station From  :");

        sToLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        sToLabel.setText("Station To      :");

        sClassLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        sClassLabel.setText("Seat Class      :");

        sDateTF.setEditable(false);
        sDateTF.setBackground(new java.awt.Color(255, 255, 255));
        sDateTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sDateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sDateTF.setText("Date");

        sFromTF.setEditable(false);
        sFromTF.setBackground(new java.awt.Color(255, 255, 255));
        sFromTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sFromTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sFromTF.setText("Station From");

        sToTF.setEditable(false);
        sToTF.setBackground(new java.awt.Color(255, 255, 255));
        sToTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sToTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sToTF.setText("Station To");

        sClassTF.setEditable(false);
        sClassTF.setBackground(new java.awt.Color(255, 255, 255));
        sClassTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sClassTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sClassTF.setText("Seat Class");

        backdftsB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        backdftsB.setText("Back");
        backdftsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backdftsBActionPerformed(evt);
            }
        });

        rfButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        rfButton.setText("Route & Fare");
        rfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfButtonActionPerformed(evt);
            }
        });

        onlineButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        onlineButton.setText("Order Online");
        onlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectedPanelLayout = new javax.swing.GroupLayout(selectedPanel);
        selectedPanel.setLayout(selectedPanelLayout);
        selectedPanelLayout.setHorizontalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sFromLabel)
                    .addComponent(sDateLabel)
                    .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sClassLabel)
                        .addComponent(sToLabel))
                    .addGroup(selectedPanelLayout.createSequentialGroup()
                        .addComponent(backdftsB)
                        .addGap(167, 167, 167)
                        .addComponent(selectedLabel)))
                .addGap(100, 100, 100)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sFromTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(sDateTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sToTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sClassTF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rfButton)
                    .addComponent(onlineButton))
                .addGap(10, 10, 10))
        );
        selectedPanelLayout.setVerticalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedLabel)
                    .addComponent(backdftsB)
                    .addComponent(rfButton))
                .addGap(10, 10, 10)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sDateLabel)
                    .addComponent(sDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sFromLabel)
                    .addComponent(sFromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sToLabel)
                    .addComponent(sToTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sClassLabel)
                    .addComponent(sClassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onlineButton))
                .addGap(9, 9, 9))
        );

        rfButton.setVisible(false);
        onlineButton.setVisible(false);

        availableLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        availableLabel.setText("Available Trains List :");

        trainListTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        trainListTable.setRowHeight(25);
        trainListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        trainListSP.setViewportView(trainListTable);
        trainListTable.getTableHeader().setReorderingAllowed(false);
        trainListTable.getTableHeader().setResizingAllowed(false);
        trainListTable.getTableHeader().setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));

        trainListTable.getSelectionModel().addListSelectionListener(new RowSelectionHandler());

        javax.swing.GroupLayout trainsPanelLayout = new javax.swing.GroupLayout(trainsPanel);
        trainsPanel.setLayout(trainsPanelLayout);
        trainsPanelLayout.setHorizontalGroup(
            trainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(availableLabel))
            .addComponent(trainListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        trainsPanelLayout.setVerticalGroup(
            trainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(availableLabel)
                .addGap(23, 23, 23)
                .addComponent(trainListSP, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout trainListPanelLayout = new javax.swing.GroupLayout(trainListPanel);
        trainListPanel.setLayout(trainListPanelLayout);
        trainListPanelLayout.setHorizontalGroup(
            trainListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainListPanelLayout.createSequentialGroup()
                .addGroup(trainListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trainListPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(selectedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(trainsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trainListPanelLayout.setVerticalGroup(
            trainListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainListPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(selectedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trainsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(trainListPanel, "trainListPanel");

        sRFLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        sRFLabel.setText("You Have Entered Train No :");

        sTrainNoTF.setEditable(false);
        sTrainNoTF.setBackground(new java.awt.Color(255, 255, 255));
        sTrainNoTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        sTrainNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sTrainNoTF.setText("Train No");

        backListB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        backListB.setText("Back");
        backListB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backListBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sRFPanelLayout = new javax.swing.GroupLayout(sRFPanel);
        sRFPanel.setLayout(sRFPanelLayout);
        sRFPanelLayout.setHorizontalGroup(
            sRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sRFPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(backListB)
                .addGap(118, 118, 118)
                .addComponent(sRFLabel)
                .addGap(50, 50, 50)
                .addComponent(sTrainNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        sRFPanelLayout.setVerticalGroup(
            sRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sRFPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(sRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sRFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sTrainNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sRFLabel))
                    .addComponent(backListB))
                .addGap(10, 10, 10))
        );

        sRFSP.setBorder(null);

        sRFTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        sRFTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        sRFTable.setRowHeight(20);
        sRFTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sRFTable.getTableHeader().setReorderingAllowed(false);
        sRFTable.getTableHeader().setResizingAllowed(false);
        sRFSP.setViewportView(sRFTable);
        sRFTable.getTableHeader().setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sRFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(sRFSP)
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sRFPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sRFSP, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
        );

        add(detailsPanel, "detailsPanel");

        oselLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        oselLabel.setText("You Have Selected :");

        osDateLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osDateLabel.setText("Date              :");

        osDateTF.setEditable(false);
        osDateTF.setBackground(new java.awt.Color(255, 255, 255));
        osDateTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        osDateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        osDateTF.setText("Date");

        osFromLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osFromLabel.setText("Station From  :");

        osFromTF.setEditable(false);
        osFromTF.setBackground(new java.awt.Color(255, 255, 255));
        osFromTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        osFromTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        osFromTF.setText("Station From");

        osToLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osToLabel.setText("Station To      :");

        osToTF.setEditable(false);
        osToTF.setBackground(new java.awt.Color(255, 255, 255));
        osToTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        osToTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        osToTF.setText("Station To");

        osClassLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osClassLabel.setText("Seat Class      :");

        osClassTF.setEditable(false);
        osClassTF.setBackground(new java.awt.Color(255, 255, 255));
        osClassTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        osClassTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        osClassTF.setText("Seat Class");

        osTrainNoL.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osTrainNoL.setText("Train No.        :");

        osTrainNoTF.setEditable(false);
        osTrainNoTF.setBackground(new java.awt.Color(255, 255, 255));
        osTrainNoTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        osTrainNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        osTrainNoTF.setText("Train No");

        backOLB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        backOLB.setText("Back");
        backOLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backOLBActionPerformed(evt);
            }
        });

        connectB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        connectB.setText("Connect");
        connectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBActionPerformed(evt);
            }
        });

        osSeatNoL.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osSeatNoL.setText("Seat No.         :");

        seatList.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        seatList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        seatList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        seatList.setVisibleRowCount(2);
        seatListSP.setViewportView(seatList);

        osFareL.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        osFareL.setText("Total Fare       :");

        osFareTF.setEditable(false);
        osFareTF.setBackground(new java.awt.Color(255, 255, 255));
        osFareTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        osFareTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        osFareTF.setText("Total Fare");

        seatPlanB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        seatPlanB.setText("Seat Plan");
        seatPlanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatPlanBActionPerformed(evt);
            }
        });

        purchaseButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        newsButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        newsButton.setText("News");
        newsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oselPanelLayout = new javax.swing.GroupLayout(oselPanel);
        oselPanel.setLayout(oselPanelLayout);
        oselPanelLayout.setHorizontalGroup(
            oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oselPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(osFromLabel)
                    .addComponent(osDateLabel)
                    .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(osClassLabel)
                        .addComponent(osToLabel)
                        .addComponent(osTrainNoL))
                    .addGroup(oselPanelLayout.createSequentialGroup()
                        .addComponent(backOLB)
                        .addGap(167, 167, 167)
                        .addComponent(oselLabel))
                    .addComponent(osSeatNoL)
                    .addComponent(osFareL))
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oselPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(connectB))
                    .addGroup(oselPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(osFareTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(osFromTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(osDateTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(osToTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(osClassTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(osTrainNoTF))
                            .addComponent(seatListSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(oselPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(purchaseButton)
                                    .addComponent(seatPlanB)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oselPanelLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(newsButton)))))
                .addGap(10, 10, 10))
        );
        oselPanelLayout.setVerticalGroup(
            oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oselPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oselLabel)
                    .addComponent(backOLB)
                    .addComponent(connectB))
                .addGap(10, 10, 10)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osDateLabel)
                    .addComponent(osDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osFromLabel)
                    .addComponent(osFromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osToLabel)
                    .addComponent(osToTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newsButton))
                .addGap(14, 14, 14)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osClassLabel)
                    .addComponent(osClassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osTrainNoL)
                    .addComponent(osTrainNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oselPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(osSeatNoL))
                    .addComponent(seatPlanB)
                    .addComponent(seatListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(oselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osFareTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(osFareL)
                    .addComponent(purchaseButton))
                .addGap(30, 30, 30))
        );

        rfButton.setVisible(false);
        seatPlanB.setVisible(false);
        purchaseButton.setVisible(false);
        newsButton.setVisible(false);

        clientLogTA.setEditable(false);
        clientLogTA.setColumns(20);
        clientLogTA.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        clientLogTA.setRows(5);
        clientLogSP.setViewportView(clientLogTA);

        javax.swing.GroupLayout onlinePanelLayout = new javax.swing.GroupLayout(onlinePanel);
        onlinePanel.setLayout(onlinePanelLayout);
        onlinePanelLayout.setHorizontalGroup(
            onlinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlinePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(onlinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oselPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientLogSP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10))
        );
        onlinePanelLayout.setVerticalGroup(
            onlinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlinePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(oselPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(clientLogSP, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        add(onlinePanel, "online");
        onlinePanel.setVisible(false);

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

        stepsLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        stepsLabel.setText("Next Steps :");

        s1Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s1Label.setText("1. Pay Fare Through bKash Account.");

        s2Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s2Label.setText("2. Visit Purchase History Tab.");

        s3Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s3Label.setText("3. Download Your Ticket.");

        s4Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s4Label.setText("4. Print It.");

        s5Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s5Label.setText("                                         Thank You.");

        javax.swing.GroupLayout finalPanelLayout = new javax.swing.GroupLayout(finalPanel);
        finalPanel.setLayout(finalPanelLayout);
        finalPanelLayout.setHorizontalGroup(
            finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalPanelLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addGroup(finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3Label)
                    .addComponent(s2Label)
                    .addComponent(stepsLabel)
                    .addGroup(finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(s4Label, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(s1Label))
                    .addComponent(ticketViewP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(302, 302, 302))
        );
        finalPanelLayout.setVerticalGroup(
            finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ticketViewP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(stepsLabel)
                .addGap(15, 15, 15)
                .addComponent(s1Label)
                .addGap(15, 15, 15)
                .addComponent(s2Label)
                .addGap(15, 15, 15)
                .addComponent(s3Label)
                .addGap(15, 15, 15)
                .addComponent(s4Label)
                .addGap(15, 15, 15)
                .addComponent(s5Label)
                .addGap(44, 44, 44))
        );

        add(finalPanel, "finalPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void dateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateButtonActionPerformed
        //        shortHorn();
        dateList.setVisible(true);
    }//GEN-LAST:event_dateButtonActionPerformed

    private void dateListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dateListValueChanged
        
        Thread thread = new Thread(){
            @Override
            public void run(){
                nullClass();
//  shortHorn();
        char [] temp = new char[3];
        dateList.getSelectedValue().toString().getChars(0, 3, temp, 0);
        Off_Day = new String(temp);
        dhakaRB.setVisible(true);
        bimanbandarRB.setVisible(true);
        rajshahiRB.setVisible(true);
        khulnaRB.setVisible(true);
        chittagongRB.setVisible(true);
        sylhetRB.setVisible(true);
            }};
        thread.start();
    }//GEN-LAST:event_dateListValueChanged

    private void dhakaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dhakaRBActionPerformed
        nullClass();
    }//GEN-LAST:event_dhakaRBActionPerformed

    private void bimanbandarRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimanbandarRBActionPerformed
        nullClass();
    }//GEN-LAST:event_bimanbandarRBActionPerformed

    private void rajshahiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rajshahiRBActionPerformed
        nullClass();
    }//GEN-LAST:event_rajshahiRBActionPerformed

    private void sylhetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sylhetRBActionPerformed
        nullClass();
    }//GEN-LAST:event_sylhetRBActionPerformed

    private void khulnaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khulnaRBActionPerformed
        nullClass();
    }//GEN-LAST:event_khulnaRBActionPerformed

    private void chittagongRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chittagongRBActionPerformed
        nullClass();
    }//GEN-LAST:event_chittagongRBActionPerformed

    private void toListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_toListValueChanged

        //        longHorn();
        
        Thread thread = new Thread(){
            @Override
            public void run(){
        acLabel.setVisible(true);
        fLabel.setVisible(true);
        sLabel.setVisible(true);
        classPanel.setVisible(true);
        if (toList.getSelectedValue()!=null)
            ToList = toList.getSelectedValue().toString();
        trainListGenerator();
            }
        };
        thread.start();
        
    }//GEN-LAST:event_toListValueChanged

    private void acberthRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acberthRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        //        shortHorn();
    }//GEN-LAST:event_acberthRBActionPerformed

    private void acseatRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acseatRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        // shortHorn();
    }//GEN-LAST:event_acseatRBActionPerformed

    private void snigdhaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snigdhaRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        //shortHorn();
    }//GEN-LAST:event_snigdhaRBActionPerformed

    private void fberthRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fberthRBActionPerformed
        sSeatClass = evt.getActionCommand();
                
        searchTrainButton.setVisible(true);
        //  shortHorn();
    }//GEN-LAST:event_fberthRBActionPerformed

    private void fseatRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fseatRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        //  shortHorn();
    }//GEN-LAST:event_fseatRBActionPerformed

    private void fchairRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fchairRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        //shortHorn();
    }//GEN-LAST:event_fchairRBActionPerformed

    private void schairRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schairRBActionPerformed
        sSeatClass = evt.getActionCommand();
        
        searchTrainButton.setVisible(true);
        //shortHorn();
    }//GEN-LAST:event_schairRBActionPerformed

    private void shovonRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shovonRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        // shortHorn();
    }//GEN-LAST:event_shovonRBActionPerformed

    private void shulovRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shulovRBActionPerformed
        sSeatClass = evt.getActionCommand();
        searchTrainButton.setVisible(true);
        //shortHorn();
    }//GEN-LAST:event_shulovRBActionPerformed

    private void searchTrainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTrainButtonActionPerformed
        dftsPanel.setVisible(false);
        trainListPanel.setVisible(true);
        Thread thread = new Thread("SearchButton"){
            @Override
            public void run(){
        
        sDate = dateList.getSelectedValue().toString();
        sFrom = From;
        sTo = ToList;                        
        sDateTF.setText(sDate);
        sFromTF.setText(sFrom);
        sToTF.setText(sTo);
        sClassTF.setText(sSeatClass);
        String[][] listRowData = new TrainListGenerator(Off_Day, From, ToList).getFinalData(sSeatClass);
        String [] listColumnNames = new SchTable().getSchColumnNames();
        trainListTable.setModel(new DefaultTableModel(listRowData, listColumnNames){
                public boolean isCellEditable(int row, int column) {
                    return false;
                }});}};
        thread.start();
        
    }//GEN-LAST:event_searchTrainButtonActionPerformed

    private void backdftsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backdftsBActionPerformed
        
            isDisconnected =true;
        //    socket.close();
            trainListPanel.setVisible(false);
            searchTrainButton.setVisible(false);
            classBG.clearSelection();
            dftsPanel.setVisible(true);
        
    }//GEN-LAST:event_backdftsBActionPerformed

    private void backListBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backListBActionPerformed
        detailsPanel.setVisible(false);
        trainListPanel.setVisible(true);
    }//GEN-LAST:event_backListBActionPerformed

    private void rfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfButtonActionPerformed
        trainListPanel.setVisible(false);
        detailsPanel.setVisible(true);
        Thread thread = new Thread("RFButton"){
            @Override
            public void run(){
        sTrainNoTF.setText(sTrainNo);
        RouteFareList routeFare = new RouteFareList(sTrainNo);
        String [][] rfRowData = routeFare.getRFData();
        String [] rfColumnNames = routeFare.getRFColumnNames();

        sRFTable.setModel(new DefaultTableModel(rfRowData, rfColumnNames){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        sRFTable.getColumnModel().getColumn(1).setMinWidth(150);
        sRFTable.getColumnModel().getColumn(2).setMinWidth(100);
        sRFTable.getColumnModel().getColumn(3).setMinWidth(120);
            }}; thread.start();

    }//GEN-LAST:event_rfButtonActionPerformed

    private void onlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineButtonActionPerformed
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE, +30);
        String leastTime = String.format("%tR\n",nowTime);
        if (dateList.getSelectedIndex()==0 && leastTime.compareTo(sDepartureTime)>0){
            JOptionPane.showMessageDialog(null, "You can book ticket at least 30 minutes before.");
        }
        else{
            osDateTF.setText(sDate);
            osFromTF.setText(sFrom);
            osToTF.setText(sTo);
            osClassTF.setText(sSeatClass);
            osTrainNoTF.setText(sTrainNo);
            trainListPanel.setVisible(false);
            onlinePanel.setVisible(true);    
        }
    }//GEN-LAST:event_onlineButtonActionPerformed

    private void backOLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backOLBActionPerformed
        onlinePanel.setVisible(false);
        seatList.setVisible(false);
        osFareTF.setText("Total Fare");
        purchaseButton.setVisible(false);
        trainListPanel.setVisible(true);
    }//GEN-LAST:event_backOLBActionPerformed

    private void connectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBActionPerformed
        isDisconnected = false;
        new Client();
    }//GEN-LAST:event_connectBActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String userName = userNameTF.getText();
        String phoneNo = phoneNoTF.getText();
        char[] password = passwordPF.getPassword();
        String temp = new String(password);
        if (!userName.trim().isEmpty() && !phoneNo.trim().isEmpty() && !temp.trim().isEmpty()){
            clientData = new Registration(userName, phoneNo, password);
            trainData = new TrainData(sDate, sFrom, sTo, sSeatClass, sTrainNo, sTrainName, sDepartureTime);
            new OutputToServer(socket);
        }
        else
            JOptionPane.showMessageDialog(null, "Please enter valid information.");
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private final ACBerthBPanel acfberthPanel = new ACBerthBPanel();
    private final SeatPanel acfseatPanel = new SeatPanel();
    private final ACChairBPanel chairBPanel = new ACChairBPanel();
    private final ShovonBPanel shovonBPanel = new ShovonBPanel();
    
    private void seatPlanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatPlanBActionPerformed
        
        
         Thread thread = new Thread(){
            @Override
            public void run(){
        classNameTF.setText(sSeatClass);
        JViewport seatPlanVP = seatPlanSP.getViewport();
        if (null != sSeatClass)
            switch (sSeatClass) {
            case "AC_Berth":
            case "F_Berth":
                seatPlanVP.setView(acfberthPanel);
                break;
            case "AC_Seat":
            case "F_Seat":
                seatPlanVP.setView(acfseatPanel);
                break;
            case "Snigdha":
            case "F_Chair":
            case "S_Chair":
                seatPlanVP.setView(chairBPanel);
                break;
            case "Shovon":
                seatPlanVP.setView(shovonBPanel);
                break;
        }
             
        seatPlanFrame.setVisible(true);
        
            }};
         thread.start();
    }//GEN-LAST:event_seatPlanBActionPerformed

     private String[] seats;
     private String fare;
     
    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        
        
        if (null != sSeatClass)
            switch (sSeatClass) {
            case "AC_Berth":
            case "F_Berth":
                seats = acfberthPanel.getSeatList();
                break;
            case "AC_Seat":
            case "F_Seat":
                seats = acfseatPanel.getSeatList();
                break;
            case "Snigdha":
            case "F_Chair":
            case "S_Chair":
                seats = chairBPanel.getSeatList();
                break;
            case "Shovon":
                seats = shovonBPanel.getSeatList();
                break;
        }
        
        if (seats.length == 0)
            JOptionPane.showMessageDialog(null, "You have not selected any seat.");
        else{            
            seatList.setModel(new javax.swing.AbstractListModel() {
                String[] strings = seats;
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
            });
            
            seatList.setVisible(true);
            
             fare = fareCalculator();
            
            if (fare!=null){
                osFareTF.setText(fare);
                purchaseButton.setVisible(true);
            }
            else{
                osFareTF.setText("Total Fare");
                purchaseButton.setVisible(false);
            }
            
            seatPlanFrame.dispose();
        }
    }//GEN-LAST:event_doneButtonActionPerformed

    private boolean isDisconnected = false;
    
    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        try {
            ticketGenerator();            
            onlinePanel.setVisible(false);
            isDisconnected = true;
            //socket.close();
            finalPanel.setVisible(true);       
        } catch (Exception ex) {}
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void newsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsButtonActionPerformed
        newsFrame.setVisible(true);
    }//GEN-LAST:event_newsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acLabel;
    private javax.swing.JRadioButton acberthRB;
    private javax.swing.JRadioButton acseatRB;
    private javax.swing.JLabel availableLabel;
    private javax.swing.JButton backListB;
    private javax.swing.JButton backOLB;
    private javax.swing.JButton backdftsB;
    private javax.swing.JRadioButton bimanbandarRB;
    private javax.swing.JRadioButton chittagongRB;
    private javax.swing.ButtonGroup classBG;
    private javax.swing.JLabel classL;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField classNameTF;
    private javax.swing.JPanel classPanel;
    private javax.swing.JScrollPane classSP;
    private javax.swing.JTextField classTF;
    private javax.swing.JScrollPane clientLogSP;
    private javax.swing.JTextArea clientLogTA;
    private javax.swing.JButton connectB;
    private javax.swing.JButton dateButton;
    private javax.swing.JList dateList;
    private javax.swing.JScrollPane dateListSP;
    private javax.swing.JPanel datePanel;
    private javax.swing.JLabel deptimeLabel;
    private javax.swing.JTextField deptimeTF;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel dftsPanel;
    private javax.swing.JRadioButton dhakaRB;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel fLabel;
    private javax.swing.JLabel fareLabel;
    private javax.swing.JTextField fareTF;
    private javax.swing.JRadioButton fberthRB;
    private javax.swing.JRadioButton fchairRB;
    private javax.swing.JPanel finalPanel;
    private javax.swing.ButtonGroup fromBG;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JRadioButton fseatRB;
    private javax.swing.JLabel jdateLabel;
    private javax.swing.JTextField jdateTF;
    private javax.swing.JRadioButton khulnaRB;
    private javax.swing.JButton newsButton;
    private javax.swing.JFrame newsFrame;
    private javax.swing.JScrollPane newsSP;
    private javax.swing.JTextArea newsTA;
    private javax.swing.JButton onlineButton;
    private javax.swing.JPanel onlinePanel;
    private javax.swing.JLabel osClassLabel;
    private javax.swing.JTextField osClassTF;
    private javax.swing.JLabel osDateLabel;
    private javax.swing.JTextField osDateTF;
    private javax.swing.JLabel osFareL;
    private javax.swing.JTextField osFareTF;
    private javax.swing.JLabel osFromLabel;
    private javax.swing.JTextField osFromTF;
    private javax.swing.JLabel osSeatNoL;
    private javax.swing.JLabel osToLabel;
    private javax.swing.JTextField osToTF;
    private javax.swing.JLabel osTrainNoL;
    private javax.swing.JTextField osTrainNoTF;
    private javax.swing.JLabel oselLabel;
    private javax.swing.JPanel oselPanel;
    private javax.swing.JLabel passwordL;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JLabel phoneNoL;
    private javax.swing.JTextField phoneNoTF;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JLabel railLabel;
    private javax.swing.JRadioButton rajshahiRB;
    private javax.swing.JFrame regFrame;
    private javax.swing.JPanel regPanel;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton rfButton;
    private javax.swing.JLabel s1Label;
    private javax.swing.JLabel s2Label;
    private javax.swing.JLabel s3Label;
    private javax.swing.JLabel s4Label;
    private javax.swing.JLabel s5Label;
    private javax.swing.JLabel sClassLabel;
    private javax.swing.JTextField sClassTF;
    private javax.swing.JLabel sDateLabel;
    private javax.swing.JTextField sDateTF;
    private javax.swing.JLabel sFromLabel;
    private javax.swing.JTextField sFromTF;
    private javax.swing.JLabel sLabel;
    private javax.swing.JLabel sRFLabel;
    private javax.swing.JPanel sRFPanel;
    private javax.swing.JScrollPane sRFSP;
    private javax.swing.JTable sRFTable;
    private javax.swing.JLabel sToLabel;
    private javax.swing.JTextField sToTF;
    private javax.swing.JTextField sTrainNoTF;
    private javax.swing.JRadioButton schairRB;
    private javax.swing.JButton searchTrainButton;
    private javax.swing.JList seatList;
    private javax.swing.JScrollPane seatListSP;
    private javax.swing.JLabel seatNoLabel;
    private javax.swing.JTextField seatNoTF;
    private javax.swing.JPanel seatPanel;
    private javax.swing.JButton seatPlanB;
    private javax.swing.JFrame seatPlanFrame;
    private javax.swing.JScrollPane seatPlanSP;
    private javax.swing.JLabel selectedLabel;
    private javax.swing.JPanel selectedPanel;
    private javax.swing.JLabel sfromL;
    private javax.swing.JTextField sfromTF;
    private javax.swing.JRadioButton shovonRB;
    private javax.swing.JRadioButton shulovRB;
    private javax.swing.JRadioButton snigdhaRB;
    private javax.swing.JLabel stepsLabel;
    private javax.swing.JLabel stoLabel;
    private javax.swing.JTextField stoTF;
    private javax.swing.JRadioButton sylhetRB;
    private javax.swing.JPanel ticketViewP;
    private javax.swing.JLabel toLabel;
    private javax.swing.JList toList;
    private javax.swing.JScrollPane toListSP;
    private javax.swing.JPanel toPanel;
    private javax.swing.JPanel trainListPanel;
    private javax.swing.JScrollPane trainListSP;
    private javax.swing.JTable trainListTable;
    private javax.swing.JLabel trainNameL;
    private javax.swing.JTextField trainNameTF;
    private javax.swing.JLabel trainNoLabel;
    private javax.swing.JTextField trainNoTF;
    private javax.swing.JPanel trainsPanel;
    private javax.swing.JLabel userNameL;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables


     @Override
    public void actionPerformed(ActionEvent e) {
       
        Thread thread = new Thread(){
            @Override
            public void run(){
                nullClass();
        
       // longHorn(); 
        From = e.getActionCommand();
        if ("Biman_Bandar".equals(From))
            From = "Dhaka";
        toList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = toListGenerator();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        toList.setVisible(true);

        }};
        thread.start();
    
    }
    
    
    private String fareCalculator(){
        String pFare = new RouteFareList(sTrainNo).getFare(sTo, sSeatClass);
        if (pFare!=null){
            int totalFare = Integer.parseInt(pFare) * seats.length;
            double vat = totalFare * 0.15;
            int netFare = totalFare + (int) vat;
            return Integer.toString(netFare)+" BDT";
        }
        else
            return null;
    }
    private boolean isBooked = false;
    private void ticketGenerator(){
        
        
            String seatNo = Arrays.toString(seats);
            seatNo = seatNo.replace('[', ' ');
            seatNo = seatNo.replace(']', ' ');
            trainNoTF.setText(sTrainNo.toUpperCase());
            trainNameTF.setText(sTrainName.toUpperCase());
            sfromTF.setText(sFrom.toUpperCase());
            stoTF.setText(sTo.toUpperCase());
            jdateTF.setText(sDate.toUpperCase());
            deptimeTF.setText(sDepartureTime.toUpperCase());
            classTF.setText(sSeatClass.toUpperCase());
            seatNoTF.setText(seatNo.toUpperCase());
            fareTF.setText(fare.toUpperCase());
            
            
            
            bookedSeats = new BookedSeats(seats, fare);
            isBooked = true;
            
        
                    
        
    }
    
    
    
    
    
    class ListSelectionHandler implements ListSelectionListener{
        @Override
        public void valueChanged(ListSelectionEvent e) {
            Thread thread = new Thread(){
            @Override
            public void run(){
                nullClass();
            char [] temp = new char[3];
            dateList.getSelectedValue().toString().getChars(0, 3, temp, 0);       
            Off_Day = new String(temp);
            if(Off_Day!=null && From !=null){           
                toList.setModel(new javax.swing.AbstractListModel() {
                String[] strings = toListGenerator();
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
                });
            }
        }
            };
            thread.start();
        }
    }
    
    class RowSelectionHandler implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent e) {
            TableModel tModel = trainListTable.getModel();
            int row = trainListTable.getSelectedRow();
            rfButton.setVisible(true);
            onlineButton.setVisible(true);
            try{ 
                sTrainNo = (String) tModel.getValueAt(row, 0);                
                sTrainName = (String) tModel.getValueAt(row, 1);
                sDepartureTime = (String) tModel.getValueAt(row, 4);
            }catch(Exception ex){}
        }
        
    }
    
    private Registration clientData;
    private TrainData trainData;
    private BookedSeats bookedSeats;
            
    
    
    private Socket socket;
    
    private void connectionFailure(){
        seatPlanB.setVisible(false);
       seatPlanFrame.setVisible(false);
       String msg = "Server is disconnected. Please try again. ";
       if (!isDisconnected)
            JOptionPane.showMessageDialog(null, msg);
       clientLogTA.append(msg + new Date() +"\n");
       connectB.setVisible(true);
       
       
   }
    
    private class Client {
    
        private final int port = 2012;
        private final String address = "127.0.0.1";

        public Client() {
            Thread clientThread = new Thread(){
            @Override
            public void run(){
            try {
                clientLogTA.append(new Date() + "\n-----------------CLIENT---------------\n");
                clientLogTA.append("Establishing connection. Please wait ...\n");     
                InetAddress ip = InetAddress.getByName(address);
                socket = new Socket(ip,port);
                connectB.setVisible(false);
                //JOptionPane.showMessageDialog(null, "Connected.");
                clientLogTA.append("Connected at " + new Date() +"\n"+ socket +"\n");
                regFrame.setVisible(true);
                new InputFromServer(socket);    
                
            } catch (IOException ex) {
                connectB.setVisible(true);
                String msg = "Server is not found. Please try again later.";
                JOptionPane.showMessageDialog(null, msg);
                clientLogTA.append(msg +" at " + new Date() + "\n");
            }}};
            clientThread.start();
        }
        
        
    }
        
    private class OutputToServer implements Runnable{
        private ObjectOutputStream outputToServer;

        public OutputToServer(Socket socket) {
            try {
                Thread outThread = new Thread(this);
                BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                outputToServer = new ObjectOutputStream(bos);
                outputToServer.writeObject(clientData);                    
                outputToServer.flush();
                regFrame.setVisible(false);
                                
                outThread.start();
            } catch (IOException ex) {
                connectionFailure();
            }

        }

        @Override
        public void run() {
            try {
                outputToServer.writeObject(trainData);
                outputToServer.flush();
                
                //JOptionPane.showMessageDialog(null, "Your information has been sent.");
                clientLogTA.append(clientData.getUserName()+"'s information has been sent at "
                    +new Date()+"\n");            
                
                seatPlanB.setVisible(true);
                
            while (true){
                if (isBooked){
                    outputToServer.writeObject(bookedSeats);
                    outputToServer.flush();
                }

            }} catch (IOException ex) {
                connectionFailure();
            }
        }
    }
    
    private BookedSeats bookedSeatList;
    private TrainData [] trainHList;
    private BookedSeats [] bookedHList;
               
    private BreakingNews news;
    
    private class InputFromServer implements Runnable{
        private ObjectInputStream inputFromServer;
        public InputFromServer(Socket socket) {
            try {
                Thread inThread = new Thread(this);
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                inputFromServer = new ObjectInputStream(bis);
                inThread.start();
            } catch (IOException ex) {
                connectionFailure();
            }

        }

        @Override
        public void run() {
            try {
                Object objectNews = inputFromServer.readObject();
                Object objectBS = inputFromServer.readObject();
                bookedSeatList = (BookedSeats) objectBS;
                String[] seatList = bookedSeatList.getSeats();
                
                if (null != sSeatClass && seatList != null)
                    switch (sSeatClass) {
                    case "AC_Berth":
                    case "F_Berth":
                        acfberthPanel.setSeatsList(seatList);
                        break;
                    case "AC_Seat":
                    case "F_Seat":
                        acfseatPanel.setSeatsList(seatList);
                        break;
                    case "Snigdha":
                    case "F_Chair":
                    case "S_Chair":
                        chairBPanel.setSeatsList(seatList);
                        break;
                    case "Shovon":
                        shovonBPanel.setSeatsList(seatList);
                        break;
                }
                Object objectTH = inputFromServer.readObject();
                trainHList = (TrainData[]) objectTH;
                Object objectBH = inputFromServer.readObject();
                bookedHList = (BookedSeats[]) objectBH;
                saveClientHistory();
                news = (BreakingNews) objectNews;
                if (news.getMessage() != null)
                    newsTA.setText(news.getMessage());
                else
                    newsTA.setText("No Breaking News.");
                newsFrame.setVisible(true);
                newsButton.setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {}
                
        }
        
        private void saveClientHistory(){
            File clientFolder = new File("Ticket History");
            if (!clientFolder.exists())
                clientFolder.mkdir();
            try {
            for (int i = 0;i<trainHList.length;i++){                
            
                File clientFile = new File("Ticket History\\"+clientData.getUserName()
                +clientData.getPhoneNo()+Arrays.toString(clientData.getPassword())
                    + i + ".txt");
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(clientFile));
                ObjectOutputStream outputToFile = new ObjectOutputStream(bos);
                outputToFile.writeObject(trainHList[i]);
                outputToFile.writeObject(bookedHList[i]);
                outputToFile.flush();
            }
            JOptionPane.showMessageDialog(null, "Your purchased ticket has been saved.");
            clientLogTA.append(clientData.getUserName()+"'s purchased ticket has been saved at "
                    +new Date()+"\n");           
  
            } catch (IOException | HeadlessException ex) {}
                
        }
    }
}