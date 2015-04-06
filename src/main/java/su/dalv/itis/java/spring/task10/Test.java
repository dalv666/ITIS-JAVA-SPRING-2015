package su.dalv.itis.java.spring.task10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task10Context.xml");
        Subject subject = (Subject) classPathXmlApplicationContext.getBean("realSubject");
        subject.longMethod();
    }
}
