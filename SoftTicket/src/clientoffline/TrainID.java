package clientoffline;

public class TrainID {
    private String Train_no, Name, Off_day, From, Departure, To, Arrival;

    public void setTrain_no(String Train_no) {
        this.Train_no = Train_no;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setOff_day(String Off_day) {
        this.Off_day = Off_day;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getOff_day() {
        return Off_day;
    }

    public String getTrain_no() {
        return Train_no;
    }

    public String getName() {
        return Name;
    }

    public String getDeparture() {
        return Departure;
    }

    public String getArrival() {
        return Arrival;
    }
    
    private final String[] meterGauge = {"701", "702", "703", "704", "705", "707", "709", "710", 
                    "712", "717", "718", "719", "720", "721", "722", "723", "724", "729", "735", 
                    "737", "739", "740", "741", "742", "743", "745", "749", "751", "757", "771", 
                    "773", "774"};

    private final String[] broadGauge = {"715", "716", "725", "726", "727", "731", "733", "747", 
             "753", "754", "756", "759", "760", "761", "762", "763", "764", "765", "769", "770"};

    public String[] getMeterGauge() {
        return meterGauge;
    }

    public String[] getBroadGauge() {
        return broadGauge;
    }

    
    
    
    
    
    
}
