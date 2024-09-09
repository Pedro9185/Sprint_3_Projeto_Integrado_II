package users;

import java.util.Date;

public class User extends Person{
    private Date hireDate;
    private String position;

    public User(String name, String address, String email, String foneNumber, Date dateOfBirth, String userType, Date hireDate, String position) {
        super(name, address, email, foneNumber, dateOfBirth);
        this.hireDate = hireDate;
        this.position = position;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
