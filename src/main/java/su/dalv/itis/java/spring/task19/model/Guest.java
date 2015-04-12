package su.dalv.itis.java.spring.task19.model;


public class Guest {
    private long id;
    private String firstName;
    private String secondName;
    private long creditCardNumber;


    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Guest(long creditCardNumber, String firstName, long id, String secondName) {

        this.creditCardNumber = creditCardNumber;
        this.firstName = firstName;
        this.id = id;
        this.secondName = secondName;
    }

    public Guest() {
    }

}
