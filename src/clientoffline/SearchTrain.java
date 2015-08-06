package clientoffline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;

public class SearchTrain extends TrainInfo {
    private int numberOfStations, classIndex, stationIndex;
    private final TrainInfo [] searchTrain;
  
    private final File infoFile = new File("ReSource\\Data\\Data.tint");
    private ZipEntry ze;
    private boolean hasAC_Berth, hasAC_Seat, hasSnigdha;
    private boolean hasF_Berth, hasF_Seat, hasF_Chair;
    private boolean hasS_Chair, hasShovon, hasShulov;
    
    private String[] seat_Class = new String[9];
    private String[] stationList = new String[50];
    
    public SearchTrain(String Train_No) {
        searchTrain = new TrainInfo[50];
        TrainID[] train_sch = new TrainSch().getTrain_sch();
        for (int i=0;i<=train_sch.length;i++){
            if( Train_No!=null && Train_No.equals(train_sch[i].getTrain_no())){
                searchTrain[0] = new TrainInfo();
                searchTrain[0].setSL_No(train_sch[i].getTrain_no());
                break;
            }
        }
        
        try {
            final ZipInputStream zis = new ZipInputStream(new FileInputStream(infoFile));
            while ((ze = zis.getNextEntry()) != null){
                if (ze.toString().contains(searchTrain[0].getSL_No()))
                    break;
            }
            final InputStreamReader infoReader = new InputStreamReader(new ZipFile(infoFile).getInputStream(ze), "UTF-8");          
            final Scanner classCheck = new Scanner(new BufferedReader(infoReader));
            String [] hasClass = new String[15];
            for (int temp1=0;temp1<hasClass.length;temp1++)
                hasClass[temp1] = classCheck.next();
            setClass(hasClass);
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try{
            final ZipInputStream zis = new ZipInputStream(new FileInputStream(infoFile));
            while ((ze = zis.getNextEntry()) != null){
                if (ze.toString().contains(searchTrain[0].getSL_No()))
                    break;
            }
            final InputStreamReader infoReader = new InputStreamReader(new ZipFile(infoFile).getInputStream(ze), "UTF-8");      
            final Scanner input = new Scanner(new BufferedReader(infoReader));
            int i = 0;
            while (input.hasNext()){
                numberOfStations = i;
                searchTrain[i] = new TrainInfo();
                searchTrain[i].setSL_No(input.next());
                
                searchTrain[i].setStation_Name(input.next());
                setStationList(searchTrain[i].getStation_Name());
                
                searchTrain[i].setArrival_Time(input.next());
                searchTrain[i].setDeparture_Time(input.next());
                
                if (hasShulov)
                    searchTrain[i].setShulov(input.next());
                if (hasShovon)
                    searchTrain[i].setShovon(input.next());
                if (hasS_Chair)
                    searchTrain[i].setS_Chair(input.next());
                if (hasF_Chair)
                    searchTrain[i].setF_Chair(input.next());
                if (hasF_Seat)
                    searchTrain[i].setF_Seat(input.next());
                if (hasF_Berth)
                    searchTrain[i].setF_Berth(input.next());
                if (hasSnigdha)
                    searchTrain[i].setSnigdha(input.next());
                if (hasAC_Seat)
                    searchTrain[i].setAC_Seat(input.next());
                if (hasAC_Berth)
                    searchTrain[i].setAC_Berth(input.next());
                i++;
            }
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
        
        classDisplay();
        
          
    }
    private void setClass(String [] hasClass){
        for (String tempS : hasClass) {
            if (null != tempS)
                switch (tempS) {
                case "AC_Berth":
                    hasAC_Berth = true;
                    break;
                case "AC_Seat":
                    hasAC_Seat = true;
                    break;
                case "Snigdha":
                    hasSnigdha = true;
                    break;
                case "F_Berth":
                    hasF_Berth = true;
                    break;
                case "F_Seat":
                    hasF_Seat = true;
                    break;
                case "F_Chair":
                    hasF_Chair = true;
                    break;
                case "S_Chair":
                    hasS_Chair = true;
                    break;
                case "Shovon":
                    hasShovon = true;
                    break;
                case "Shulov":
                    hasShulov = true;
                    break;
            }
        }
    }
    private void classDisplay(){
        
        ClassListGenerator(searchTrain[0].getShulov());
        ClassListGenerator(searchTrain[0].getShovon());
        ClassListGenerator(searchTrain[0].getS_Chair());
        ClassListGenerator(searchTrain[0].getF_Chair());
        ClassListGenerator(searchTrain[0].getF_Seat());
        ClassListGenerator(searchTrain[0].getF_Berth());
        ClassListGenerator(searchTrain[0].getSnigdha());
        ClassListGenerator(searchTrain[0].getAC_Seat());
        ClassListGenerator(searchTrain[0].getAC_Berth());
      
    }
    
    private void ClassListGenerator(String seat){
        if(seat!=null){
            seat_Class[classIndex] = seat;
            classIndex++;
        }
    }

    public String[] getSeat_Class() {
        return seat_Class;
    }

    private void setStationList(String station) {
        if (station != null && !"Station_Name".equals(station)){
            stationList[stationIndex] = station;
            stationIndex++;
        }
        
    }

    public String[] getStationList() {
        return stationList;
    }
    

    public TrainInfo[] getSearchTrain() {
        return searchTrain;
    }
    
}
