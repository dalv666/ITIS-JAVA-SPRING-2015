package su.dalv.itis.java.spring.task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Task2Context.xml");
        Quoter shakespearQuoter = (Quoter) classPathXmlApplicationContext.getBean("shakespearQuoter");
        shakespearQuoter.sayQuote();
        Quoter terminatorQuoter = (Quoter) classPathXmlApplicationContext.getBean("terminatorQuoter");
        terminatorQuoter.sayQuote();

        //exception No qualifying bean of type [su.dalv.itis.java.spring.task2.Quoter] is defined: expected single matching bean but found 2
        classPathXmlApplicationContext.getBean(Quoter.class);
    }
}
