package clientoffline;

public class TrainInfo {
    private class Route {
        private String SL_No, Station_Name, Arrival_Time, Departure_Time; 

    }
    private class SeatClass {
        private String AC_Berth, AC_Seat, Snigdha;
        private String F_Berth, F_Seat, F_Chair;
        private String S_Chair, Shovon, Shulov;        
        
    }
    
    Route route = new Route();
    SeatClass seatClass = new SeatClass();
    
    
    public void setSL_No(String SL_No) {
        this.route.SL_No = SL_No;
    }
    
    public String getSL_No() {
        return route.SL_No;
    }
    
    public String getStation_Name() {
        return route.Station_Name;
    }

    
    public String getArrival_Time() {
        return route.Arrival_Time;
    }

    public String getDeparture_Time() {
        return route.Departure_Time;
    }

    public void setStation_Name(String Station_Name) {
        this.route.Station_Name = Station_Name;
    }

    public void setArrival_Time(String Arrival_Time) {
        this.route.Arrival_Time = Arrival_Time;
    }

    public void setDeparture_Time(String Departure_Time) {
        this.route.Departure_Time = Departure_Time;
    }
    public void setAC_Berth(String AC_Berth) {
        this.seatClass.AC_Berth = AC_Berth;
    }

    public void setAC_Seat(String AC_Seat) {
        this.seatClass.AC_Seat = AC_Seat;
    }

    public void setSnigdha(String Snigdha) {
        this.seatClass.Snigdha = Snigdha;
    }

    public void setF_Berth(String F_Berth) {
        this.seatClass.F_Berth = F_Berth;
    }

    public void setF_Seat(String F_Seat) {
        this.seatClass.F_Seat = F_Seat;
    }

    public void setF_Chair(String F_Chair) {
        this.seatClass.F_Chair = F_Chair;
    }

    public void setS_Chair(String S_Chair) {
        this.seatClass.S_Chair = S_Chair;
    }

    public void setShovon(String Shovon) {
        this.seatClass.Shovon = Shovon;
    }

    public void setShulov(String Shulov) {
        this.seatClass.Shulov = Shulov;
    }
    
    public String getAC_Berth() {
        return seatClass.AC_Berth;
    }

    public String getAC_Seat() {
        return seatClass.AC_Seat;
    }

    public String getSnigdha() {
        return seatClass.Snigdha;
    }

    public String getF_Berth() {
        return seatClass.F_Berth;
    }

    public String getF_Seat() {
        return seatClass.F_Seat;
    }

    public String getF_Chair() {
        return seatClass.F_Chair;
    }

    public String getS_Chair() {
        return seatClass.S_Chair;
    }

    public String getShovon() {
        return seatClass.Shovon;
    }

    public String getShulov() {
        return seatClass.Shulov;
    }
    
}
