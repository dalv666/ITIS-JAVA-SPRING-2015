package su.dalv.itis.java.spring.task23;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @ValidCredentials
    @Autowired
    private Credential credential;

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
}
