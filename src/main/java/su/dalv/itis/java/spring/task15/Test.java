package su.dalv.itis.java.spring.task15;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dalv6_000 on 07.04.2015.
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("su.dalv.itis.java.spring.task15");
        Services bean = annotationConfigApplicationContext.getBean(Services.class);
        bean.getDao().crud();
    }
}
