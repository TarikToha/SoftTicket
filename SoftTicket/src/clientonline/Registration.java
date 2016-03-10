package clientonline;

import java.io.Serializable;

public class Registration implements Serializable{
    private String userName, phoneNo;
    private char[] password;

    public Registration(String userName, String phoneNo, char[] password) {
        this.userName = userName;
        this.phoneNo = phoneNo;
        this.password = password;
    }

    

    public String getUserName() {
        return userName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public char[] getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
    
    
    

}
