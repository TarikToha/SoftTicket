package clientonline;

import java.io.Serializable;

public class BookedSeats implements Serializable{
    
    private String[] seats;
    private String fare;

    public BookedSeats(String[] seats, String fare) {
        this.seats = seats;
        this.fare = fare;
    }

    public String[] getSeats() {
        return seats;
    }

    public void setSeats(String[] seats) {
        this.seats = seats;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
    
    

}
