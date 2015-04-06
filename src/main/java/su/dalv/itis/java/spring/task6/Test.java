package su.dalv.itis.java.spring.task6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task6Context.xml");
        InjectableField injectableField = (InjectableField) classPathXmlApplicationContext.getBean("injectableField");
        System.out.println(injectableField.getRandomInt());
    }
}
