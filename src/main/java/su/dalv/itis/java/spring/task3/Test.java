package su.dalv.itis.java.spring.task3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("Task3Context.xml");
        //show nothing
        new ClassPathXmlApplicationContext("Task3PrototypeContext.xml");
    }
}
