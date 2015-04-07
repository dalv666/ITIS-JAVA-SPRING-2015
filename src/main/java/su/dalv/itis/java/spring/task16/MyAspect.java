package su.dalv.itis.java.spring.task16;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {

    @Autowired
    private Email emails;

    public Email getEmail() {
        return emails;
    }

    public void setEmail(Email email) {
        this.emails = email;
    }

    @AfterThrowing(pointcut = "execution(* su.dalv.itis.java.spring.task16..*.*(..))", throwing = "ex")
    private void dbException(DatabaseRuntimeException ex) {
        for (String email : emails.getEmails()) {
            System.out.println("Send to " + email + ". StackTrace:" + ex.toString());
        }
    }


}
