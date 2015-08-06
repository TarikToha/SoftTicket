package clientoffline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;

public class TrainSch extends TrainID {
    private final TrainID [] train_sch;
    private final File trainSch = new File("ReSource\\Data\\Data.tint");
    private ZipEntry ze;
    
    public TrainSch() {
        TrainID[] tempTrain_sch = new TrainID[100];
        int numberOfTrains = 0, i = 0;
        
        try {
            final ZipInputStream zis = new ZipInputStream(new FileInputStream(trainSch));
            while ((ze = zis.getNextEntry()) != null){
                if (ze.toString().contains("trainSch"))
                    break;
            }
            final InputStreamReader schReader = new InputStreamReader(new ZipFile(trainSch).getInputStream(ze), "UTF-8");
            final Scanner input = new Scanner(new BufferedReader(schReader));            
            while (input.hasNext()){
                numberOfTrains = i;
                tempTrain_sch[i]=new TrainID();
                tempTrain_sch[i].setTrain_no(input.next());
                tempTrain_sch[i].setName(input.next());
                tempTrain_sch[i].setOff_day(input.next());
                tempTrain_sch[i].setFrom(input.next());
                tempTrain_sch[i].setDeparture(input.next());
                tempTrain_sch[i].setTo(input.next());
                tempTrain_sch[i].setArrival(input.next());
                i++;
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        train_sch = new TrainID[numberOfTrains+1];
        System.arraycopy(tempTrain_sch, 0, train_sch, 0, train_sch.length);
    }  
    
    public TrainID[] getTrain_sch() {
        return train_sch;
    }

}
 
    