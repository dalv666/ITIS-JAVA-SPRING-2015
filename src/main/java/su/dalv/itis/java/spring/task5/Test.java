package su.dalv.itis.java.spring.task5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task5Context.xml");
        classPathXmlApplicationContext.getBean("runnableMethod");
    }
}
