package su.dalv.itis.java.spring.task17;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import su.dalv.itis.java.spring.task16.DatabaseRuntimeException;
import su.dalv.itis.java.spring.task16.Email;


@Aspect
@Component
public class MyAspect {

    @Around("execution((@su.dalv.itis.java.spring.task17.MyDeprecated *) *(..))")
    public void handleDeprecated(ProceedingJoinPoint pjp) {
        System.out.println("user");
    }

}
