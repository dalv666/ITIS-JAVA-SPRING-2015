package su.dalv.itis.java.spring.task7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task7Context.xml");
        Subject subject = (Subject) classPathXmlApplicationContext.getBean("benchMarkProxySubject");
        subject.longMethod();
    }

}
