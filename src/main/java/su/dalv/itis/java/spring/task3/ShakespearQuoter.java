package su.dalv.itis.java.spring.task3;


public class ShakespearQuoter implements Quoter {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        System.out.println(message);
    }
}
