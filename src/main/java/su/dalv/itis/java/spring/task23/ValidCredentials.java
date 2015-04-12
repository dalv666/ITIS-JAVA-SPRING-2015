package su.dalv.itis.java.spring.task23;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CredentialValidator.class)
public @interface ValidCredentials {


    String message() default "{Credential}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
