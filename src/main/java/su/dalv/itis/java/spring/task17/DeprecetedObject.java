package su.dalv.itis.java.spring.task17;

import org.springframework.stereotype.Component;

@Component
@MyDeprecated(newClass = NewObject.class)
public class DeprecetedObject implements CommonInterface {

    public void itis() {
        System.out.println("I old");
    }
}
