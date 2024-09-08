import java.util.Date;

public class Employee extends Person{
    private String position;
    private Date hireDate;

    public Employee(String lastName, String firstname, String address, String phone, Date dateOfBirth,String position, Date hireDate) {
        super(lastName, firstname, address, phone, dateOfBirth);
        this.position = position;
        this.hireDate = hireDate;
    }

    //com

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
