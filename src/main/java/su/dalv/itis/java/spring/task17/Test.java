package su.dalv.itis.java.spring.task17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import su.dalv.itis.java.spring.task16.Repository;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("su.dalv.itis.java.spring.task17");
        DeprecetedUser bean = annotationConfigApplicationContext.getBean(DeprecetedUser.class);
        CommonInterface commonInterface = bean.getCommonInterface();
        commonInterface.itis();
    }
}
