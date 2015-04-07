package su.dalv.itis.java.spring.task16;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Email {

    private List<String> emails;

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @PostConstruct
    private void PostConstruct(){
        emails = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            emails.add("email#"+i);
        }
    }

}
