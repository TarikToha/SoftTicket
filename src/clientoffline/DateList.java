package clientoffline;

import java.util.Calendar;

public class DateList {
    private final Calendar today = Calendar.getInstance();
    private final Calendar tempDay = today;
    private final String [] date_List = new String[10];
    public DateList(){
        Thread thread = new Thread(){
            @Override
            public void run(){
        tempDay.add(Calendar.DATE, -1);
        for (int i=0;i<10;i++){
            tempDay.add(Calendar.DATE, 1);
            date_List[i]=String.format("%1$ta, %1$td-%1$tb-%1$tY.\n",tempDay);
        }    
    }};
        thread.start();
    }

    public String[] getDate_List() {
        return date_List;
    }
}