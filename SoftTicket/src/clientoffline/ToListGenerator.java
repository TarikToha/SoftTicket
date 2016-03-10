package clientoffline;

public class ToListGenerator {
    private final int maxInput = 1000;
    private int numOfDest, allToTrains;
    private final String [] trainsDest, ToList, trainList;
    private String [] toListAll;
    
    
    
    public ToListGenerator(String off_day, String from) {
        TrainID[] train_sch = new TrainSch().getTrain_sch();
        String temp;
    
        trainsDest = new String [maxInput] ;
        toListAll = new String [maxInput];
        
        for (TrainID train_sch1 : train_sch) {
            String tempString = train_sch1.getOff_day();
            char [] tempArray = new char[3];
            tempString.getChars(0, 3, tempArray, 0);       
            String offdayfromfile = new String(tempArray);
            if (!off_day.equals(offdayfromfile)) {
                if (from.equals(train_sch1.getFrom())) {
                    SearchTrain foundTrain = new SearchTrain(train_sch1.getTrain_no());
                    String[] stationList = foundTrain.getStationList();
                    boolean flag = false;
                    if (!flag) {
                        toListAll[allToTrains] = train_sch1.getTrain_no();
                        allToTrains++;
                    }
                    for (String stationList1 : stationList) {
                        
                        temp = stationList1;
                        if (temp==null)
                            break;
                        
                        flag = false;
                        for (String trainsDest1 : trainsDest) {
                            if (trainsDest1 != null && temp.equals(trainsDest1)) {
                                flag = true;
                            }
                        }
                        
                        
                        if (!flag && !temp.equals(from.toUpperCase())){ 
                            trainsDest[numOfDest]=temp;
                            numOfDest++;
                        }
                    }
                }
            } 
        }
        String [] sortedTrainsDest;
        sortedTrainsDest = sort(trainsDest,numOfDest);
        ToList = new String[numOfDest];
        System.arraycopy(sortedTrainsDest, 0, ToList, 0, ToList.length);
        
        setToListAll(toListAll);
        trainList = new String[allToTrains];
        System.arraycopy(toListAll, 0, trainList, 0, trainList.length);
        
    }
    
    private String [] sort(String [] list, int elements){
        String temp;
        for (int i=0;i<elements;i++){
            for (int j=i+1;j<elements;j++){
                if (list[i].compareTo(list[j])>0){
                    temp = list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }          
            }
        }
        return list;
    }
    
    public String[] getToList() {
        return ToList;
    }

    private void setToListAll(String[] toListAll) {
        sort(toListAll,allToTrains);
        this.toListAll = toListAll;
    }

    public String[] getTrainList() {
        return trainList;
    } 
    
    
    
}  
   