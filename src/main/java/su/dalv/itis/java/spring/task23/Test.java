package su.dalv.itis.java.spring.task23;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DirectFieldBindingResult;
import org.springframework.validation.Validator;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Client client = (Client) context.getBean(Client.class);
        Validator validator = (Validator) context.getBean(Validator.class);

        DirectFieldBindingResult result = new DirectFieldBindingResult(client, "Client");
        validator.validate(client,result);
        System.out.println(result);
    }
}
