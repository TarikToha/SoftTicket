package server;

import java.io.Serializable;

public class BreakingNews implements Serializable{
    private String message;

    public BreakingNews(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
