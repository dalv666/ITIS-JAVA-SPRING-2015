package su.dalv.itis.java.spring.task14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task14Context.xml");
        Singleton singleton = (Singleton)classPathXmlApplicationContext.getBean("singleton");
        System.out.println(singleton.usePrototype());
        classPathXmlApplicationContext.close();
    }
}
