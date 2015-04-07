package su.dalv.itis.java.spring.task18;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class PostInitializedComponent {

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct");
    }

    @PostInitialized
    public void postInitialize() {
        System.out.println("post initialize");
    }
}
