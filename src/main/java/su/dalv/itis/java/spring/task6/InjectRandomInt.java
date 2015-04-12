package su.dalv.itis.java.spring.task6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {

    int min() default 1;

    int max() default Integer.MAX_VALUE;

}
