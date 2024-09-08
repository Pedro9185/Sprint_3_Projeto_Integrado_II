import java.util.Date;

public abstract class Person {
    private String firstname;
    private String lastName;
    private String address;
    private String phone;
    private Date dateOfBirth;

    public Person(String lastName, String firstname, String address, String phone, Date dateOfBirth) {
        this.lastName = lastName;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }


}