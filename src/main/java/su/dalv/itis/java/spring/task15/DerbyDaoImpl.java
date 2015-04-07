package su.dalv.itis.java.spring.task15;

import org.springframework.stereotype.Component;

@Derby
@Component
public class DerbyDaoImpl implements Dao {
    public void crud() {
        System.out.println("I derby dao");
    }
}
