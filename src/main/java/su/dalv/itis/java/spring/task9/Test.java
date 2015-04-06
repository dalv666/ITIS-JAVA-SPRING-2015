package su.dalv.itis.java.spring.task9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task9Context.xml");
        Subject subject = (Subject) classPathXmlApplicationContext.getBean("realSubject");
        subject.longMethod();
    }
}
