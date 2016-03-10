package clientoffline;

import home.RouteFareList;

public class TrainListGenerator {
    private int foundTrainsNumber;
    private SearchTrain allTrains, foundTrains;
    private String [] toTrainNo, combinedClassList;
    private final String [] [] class_List; 
    private final String [] location;
    
    private String [][] finalData;
    
    public TrainListGenerator(String Off_day, String From, String To) {
        To = To.toUpperCase();
        ToListGenerator toList = new ToListGenerator(Off_day,From);
        toTrainNo = toList.getTrainList();
        
        TrainID[] train_sch = new TrainSch().getTrain_sch();
    
        String [] tempLoc = new String [train_sch.length];
        
        for (String toNo : toTrainNo) {
            
                allTrains = new SearchTrain(toNo);
                String[] stationList = allTrains.getStationList();
                
                for (String stationList1 : stationList) {
                    if(To == null ? stationList1 == null : To.equals(stationList1)){
                        tempLoc[foundTrainsNumber] = toNo;
                        
                        foundTrainsNumber++;
                        break;
                    }
                }
                
                
        }
            
        location = new String[foundTrainsNumber];
        System.arraycopy(tempLoc, 0, location, 0, location.length);
        
        class_List = new String [location.length][9];
        for (int i=0;i<location.length;i++){
            foundTrains = new SearchTrain(location[i]);
            class_List[i] = foundTrains.getSeat_Class();
        }
        
        combinedClassList(class_List);
    }
    
    private void combinedClassList(String [] [] class_List){
        combinedClassList = new String[9];
        String [] classNames = {"Shulov", "Shovon", "S_Chair", "F_Chair", "F_Seat",
                                "F_Berth", "Snigdha", "AC_Seat", "AC_Berth"};
        int temp = 0;
        
        for (String className : classNames) {
            boolean flag = false;
            for (String[] class_List1 : class_List) {
                for (String class_List11 : class_List1) {
                    if (className.equals(class_List11)) {
                        combinedClassList[temp] = className;
                        temp++;
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
        }
        
    }

    public String[] getCombinedClassList() {
        return combinedClassList;
    }  
    
    public String[][] getFinalData(String seatClass){  
        seatClass = seatClass.toUpperCase();
        RouteFareList rfList;
        String[] rfColumnNames, tempList = new String[location.length];
        
        int temp = 0;
        for (String location1 : location) {
            rfList = new RouteFareList(location1);
            rfColumnNames = rfList.getRFColumnNames();
            
            for (String rfColumnName : rfColumnNames) {
                if (rfColumnName.contains(seatClass)) {
                    tempList[temp] = location1;
                    temp++;
                }
            }
        }
        String [] finalList = new String[temp];
        System.arraycopy(tempList, 0, finalList, 0, finalList.length);
        
        
        TrainID[] train_sch = new TrainSch().getTrain_sch();
        String [] [] tempdata = new String[finalList.length][7]; 
        temp = 0;
        for (String finalList1 : finalList) {
            for (TrainID train_sch1 : train_sch) {
                if (train_sch1.getTrain_no().equals(finalList1)) {
                    tempdata[temp][0] = train_sch1.getTrain_no();
                    tempdata[temp][1] = train_sch1.getName();
                    tempdata[temp][2] = train_sch1.getOff_day();
                    tempdata[temp][3] = train_sch1.getFrom();
                    tempdata[temp][4] = train_sch1.getDeparture();
                    tempdata[temp][5] = train_sch1.getTo();
                    tempdata[temp][6] = train_sch1.getArrival();
                    temp++;
                }
            }
        }
        finalData = new String[temp][7];
        System.arraycopy(tempdata, 0, finalData, 0, finalData.length);
        return finalData;
    }
   
}