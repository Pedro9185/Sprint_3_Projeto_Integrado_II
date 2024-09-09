package services;

import users.User;

import java.util.Date;

public class ClockIn {
    private Date date;
    //type=entry or departure
    private String type;
    private User user;

    public ClockIn(Date date, String type) {
        this.date = date;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
