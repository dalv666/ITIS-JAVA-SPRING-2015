package su.dalv.itis.java.spring.task4;


import java.util.List;

public class TerminatorQuoter implements Quoter {

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    private List<String> messages;

    public void sayQuote() {
        for (String quater : messages) {
            System.out.println(quater);
        }
    }
}
