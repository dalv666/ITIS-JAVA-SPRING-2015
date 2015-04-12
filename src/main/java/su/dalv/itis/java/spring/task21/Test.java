package su.dalv.itis.java.spring.task21;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DirectFieldBindingResult;
import org.springframework.validation.Validator;

public class Test {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Validator validator = (Validator) annotationConfigApplicationContext.getBean(Validator.class);
        Driver driver = new Driver(17, true, null);

        DirectFieldBindingResult result = new DirectFieldBindingResult(driver, "Driver");
        validator.validate(driver,result);
        System.out.println(result);

        driver = new Driver(77, false, "Vladislav");
        result = new DirectFieldBindingResult(driver, "Driver");
        validator.validate(driver,result);
        System.out.println(result);
    }
}
