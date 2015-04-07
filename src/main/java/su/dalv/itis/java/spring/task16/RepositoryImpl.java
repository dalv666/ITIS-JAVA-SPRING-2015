package su.dalv.itis.java.spring.task16;


import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;

@Component
public class RepositoryImpl implements Repository {


    public void save(String message) {
        throw new DatabaseRuntimeException("Sorry, smth go wrong");
    }

}
