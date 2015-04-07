package su.dalv.itis.java.spring.task15;

import org.springframework.stereotype.Component;

@Oracle
@Component
public class OracleDaoImpl implements Dao{
    public void crud() {
        System.out.println("I oracle dao");
    }
}
