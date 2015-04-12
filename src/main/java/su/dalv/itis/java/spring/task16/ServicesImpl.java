package su.dalv.itis.java.spring.task16;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicesImpl implements Services {

    @Autowired
    private Repository repository;

    public void saveData(String message) {
        try {
            repository.save("saved message");
        } catch (DatabaseRuntimeException ex) {
            ex.printStackTrace();
        }
    }
}
