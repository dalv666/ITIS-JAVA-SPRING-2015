package su.dalv.itis.java.spring.task12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task12Context.xml");
        Object deprecated = classPathXmlApplicationContext.getBean("deprecated");
        System.out.println(deprecated);
        classPathXmlApplicationContext.close();
    }
}
