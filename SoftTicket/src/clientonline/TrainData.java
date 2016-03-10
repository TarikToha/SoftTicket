package clientonline;

import java.io.Serializable;

public class TrainData implements Serializable{
    private String date, from, to, seatClass, trainNo, trainName, departureTime;

    public TrainData(String date, String from, String to, String seatClass, 
            String trainNo, String trainName, String departureTime) {
        
        this.date = date.replace('\n', ' ');
        this.from = from;
        this.to = to;
        this.seatClass = seatClass;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.departureTime = departureTime;
    }

    public String getDate() {
        
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    
}
