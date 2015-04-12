package su.dalv.itis.java.spring.task23;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CredentialValidator implements ConstraintValidator<ValidCredentials, Credential> {

    public void initialize(ValidCredentials constraintAnnotation) {

    }

    public boolean isValid(Credential value, ConstraintValidatorContext context) {
        if (value.getLogin().length() > value.getName().length() || value.getPassword().length() > value.getName().length()) {
            return false;
        }
        return true;
    }
}
