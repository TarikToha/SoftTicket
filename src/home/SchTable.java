package home;

import clientoffline.TrainID;
import clientoffline.TrainSch;

public class SchTable {
    
    private final String [] schColumnNames;
    private final String [][] schData;
    
    public SchTable(){
        
        TrainID[] train_sch = new TrainSch().getTrain_sch();
        
        schColumnNames = new String[7];
        
        schColumnNames[0] = train_sch[0].getTrain_no();
        schColumnNames[1] = train_sch[0].getName();
        schColumnNames[2] = train_sch[0].getOff_day();
        schColumnNames[3] = train_sch[0].getFrom();
        schColumnNames[4] = train_sch[0].getDeparture();
        schColumnNames[5] = train_sch[0].getTo();
        schColumnNames[6] = train_sch[0].getArrival();
                        
        schData = new String[train_sch.length-1][7];
        
        for (int i=0;i<schData.length;i++){
            schData[i][0] = train_sch[i+1].getTrain_no();
            schData[i][1] = train_sch[i+1].getName();
            schData[i][2] = train_sch[i+1].getOff_day();
            schData[i][3] = train_sch[i+1].getFrom();
            schData[i][4] = train_sch[i+1].getDeparture();
            schData[i][5] = train_sch[i+1].getTo();
            schData[i][6] = train_sch[i+1].getArrival(); 
        }
        
    }

    public String[] getSchColumnNames() {
        return schColumnNames;
    }

    public String[][] getSchData() {
        return schData;
    }

}
