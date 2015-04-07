package su.dalv.itis.java.spring.task16;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("su.dalv.itis.java.spring.task16");
        Repository bean = annotationConfigApplicationContext.getBean(Repository.class);
        bean.save("save me");
    }
}
