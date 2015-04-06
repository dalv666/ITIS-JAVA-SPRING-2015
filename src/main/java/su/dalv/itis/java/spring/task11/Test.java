package su.dalv.itis.java.spring.task11;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task11Context.xml");
        classPathXmlApplicationContext.close();
    }
}
