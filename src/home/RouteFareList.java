package home;

import clientoffline.SearchTrain;
import clientoffline.TrainInfo;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class RouteFareList {
    
    private String [] rfColumnNames;
    private String [][] rfData;

    public RouteFareList(String input) {
        try{
            SearchTrain search = new SearchTrain(input);
            TrainInfo[] trainInfo = search.getSearchTrain();
            String [] temp0, SL_NoList, temp1, NameList, temp2, ArrivalList,
                      temp3, DepartureList;
            String [] temp4, ShulovList, temp5, ShovonList, temp6, S_ChairList;
            String [] temp7, F_ChairList, temp8, F_SeatList, temp9, F_BerthList; 
            String [] temp10, SnigdhaList,temp11, AC_SeatList, temp12, AC_BerthList;

            temp0 = new String[trainInfo.length];
            temp1 = new String[trainInfo.length];
            temp2 = new String[trainInfo.length];
            temp3 = new String[trainInfo.length];
            temp4 = new String[trainInfo.length];
            temp5 = new String[trainInfo.length];
            temp6 = new String[trainInfo.length];
            temp7 = new String[trainInfo.length];
            temp8 = new String[trainInfo.length];
            temp9 = new String[trainInfo.length];
            temp10 = new String[trainInfo.length];
            temp11 = new String[trainInfo.length];
            temp12 = new String[trainInfo.length];

            int index=0;
            for (TrainInfo trainInfo1 : trainInfo) {
                if (trainInfo1 == null) {
                    break;
                }

                temp0[index] = trainInfo1.getSL_No().toUpperCase();
                temp1[index] = trainInfo1.getStation_Name().toUpperCase();
                temp2[index] = trainInfo1.getArrival_Time().toUpperCase();
                temp3[index] = trainInfo1.getDeparture_Time().toUpperCase();

                if (trainInfo1.getShulov() != null)
                    temp4[index] = trainInfo1.getShulov().toUpperCase();
                if (trainInfo1.getShovon() != null)
                    temp5[index] = trainInfo1.getShovon().toUpperCase();
                if (trainInfo1.getS_Chair() != null)
                    temp6[index] = trainInfo1.getS_Chair().toUpperCase();
                if (trainInfo1.getF_Chair() != null)
                    temp7[index] = trainInfo1.getF_Chair().toUpperCase();
                if (trainInfo1.getF_Seat() != null)
                    temp8[index] = trainInfo1.getF_Seat().toUpperCase();
                if (trainInfo1.getF_Berth() != null)
                    temp9[index] = trainInfo1.getF_Berth().toUpperCase();
                if (trainInfo1.getSnigdha() != null)
                    temp10[index] = trainInfo1.getSnigdha().toUpperCase();
                if (trainInfo1.getAC_Seat() != null)
                    temp11[index] = trainInfo1.getAC_Seat().toUpperCase();
                if (trainInfo1.getAC_Berth() != null)
                    temp12[index] = trainInfo1.getAC_Berth().toUpperCase();
                index++;
            }
            
            SL_NoList = new String[index];
            NameList = new String[index];
            ArrivalList = new String[index];
            DepartureList = new String[index];
            ShulovList = new String[index]; 
            ShovonList = new String[index]; 
            S_ChairList = new String[index];
            F_ChairList = new String[index]; 
            F_SeatList = new String[index];
            F_BerthList = new String[index];
            SnigdhaList = new String[index];
            AC_SeatList = new String[index];
            AC_BerthList = new String[index];

            System.arraycopy(temp0, 0, SL_NoList, 0, SL_NoList.length);
            System.arraycopy(temp1, 0, NameList, 0, NameList.length);
            System.arraycopy(temp2, 0, ArrivalList, 0, ArrivalList.length);
            System.arraycopy(temp3, 0, DepartureList, 0, DepartureList.length);
            System.arraycopy(temp4, 0, ShulovList, 0, ShulovList.length);
            System.arraycopy(temp5, 0, ShovonList, 0, ShovonList.length);
            System.arraycopy(temp6, 0, S_ChairList, 0, S_ChairList.length);
            System.arraycopy(temp7, 0, F_ChairList, 0, F_ChairList.length);
            System.arraycopy(temp8, 0, F_SeatList, 0, F_SeatList.length);
            System.arraycopy(temp9, 0, F_BerthList, 0, F_BerthList.length);
            System.arraycopy(temp10, 0, SnigdhaList, 0, SnigdhaList.length);
            System.arraycopy(temp11, 0, AC_SeatList, 0, AC_SeatList.length);
            System.arraycopy(temp12, 0, AC_BerthList, 0, AC_BerthList.length);

            String [][] temp = new String [13][index];
            temp[0] = SL_NoList;
            temp[1] = NameList;
            temp[2] = ArrivalList;
            temp[3] = DepartureList;
            temp[4] = ShulovList;
            temp[5] = ShovonList;
            temp[6] = S_ChairList;
            temp[7] = F_ChairList;
            temp[8] = F_SeatList;
            temp[9] = F_BerthList;
            temp[10] = SnigdhaList;
            temp[11] = AC_SeatList;
            temp[12] = AC_BerthList;
            
            
            int realIndex = 0;
            for (String[] tem : temp) {
                if (tem[0] != null) {
                    realIndex++;
                }
            }
            
            rfColumnNames = new String[realIndex];         
            int colIndex = 0;   
            for (String[] tem : temp) {
                if (tem[0] != null) {
                    rfColumnNames[colIndex] = tem[0];
                    colIndex++;
                }
            }
            
            rfData = new String [index-1] [rfColumnNames.length];  
            colIndex = 0;
            for (String[] tem : temp) {
                if (tem[0] != null) {
                    for (int i = 1; i < tem.length; i++) {
                        rfData [i-1] [colIndex] = tem[i];
                    }
                    colIndex++;
                }
            }  

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please Enter Correct Input.\n"
                    + "Visit Train Schedule Tab.");
        }
    }
    
  
   
    public String[][] getRFData() {
        return rfData;
    }
    
    

    public String[] getRFColumnNames() {
        return rfColumnNames;
    }
    
    
    public String getFare(String toStation, String seatClass){
        
        toStation = toStation.toUpperCase();
        seatClass = seatClass.toUpperCase();
        
        int row = 0, col = 0;
        
        for (int i=0;i<rfColumnNames.length;i++){
            if (seatClass.equals(rfColumnNames[i])){
                col = i;
                break;
            }       
        }
        
        for (int j=0;j<rfData.length;j++){
            if (toStation.equals(rfData[j][1])){
                row = j;
                break;
            }
        }
        if (row != 0 && col != 0)
            return rfData[row][col];
        else
            return null;
    }
     
}
