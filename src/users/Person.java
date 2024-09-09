package users;

import java.util.Date;

public abstract class Person {
    protected String name;
    protected String address;
    protected String email;
    protected String foneNumber;
    protected Date dateOfBirth;

    public Person(String name, String address, String email, String foneNumber, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.foneNumber = foneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneNumber() {
        return foneNumber;
    }

    public void setFoneNumber(String foneNumber) {
        this.foneNumber = foneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
