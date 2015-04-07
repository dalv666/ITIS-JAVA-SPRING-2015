package su.dalv.itis.java.spring.Task13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task13Context.xml");
        StringBuilder deprecated = (StringBuilder)classPathXmlApplicationContext.getBean("stringBuilder");
        System.out.println(deprecated.toString());
        classPathXmlApplicationContext.close();
    }
}
