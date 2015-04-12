package su.dalv.itis.java.spring.task22;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DirectFieldBindingResult;
import org.springframework.validation.Validator;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Taxi taxi = (Taxi) context.getBean(Taxi.class);
        Validator validator = (Validator) context.getBean(Validator.class);

        DirectFieldBindingResult result = new DirectFieldBindingResult(taxi, "Taxi");
        validator.validate(taxi,result);
        System.out.println(result);
    }
}
