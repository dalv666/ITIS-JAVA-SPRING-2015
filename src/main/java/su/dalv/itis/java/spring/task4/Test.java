package su.dalv.itis.java.spring.task4;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task4Context.xml");
        su.dalv.itis.java.spring.task2.Quoter terminatorQuoter = (su.dalv.itis.java.spring.task2.Quoter) classPathXmlApplicationContext.getBean("terminatorQuoter");
        terminatorQuoter.sayQuote();
    }
}
