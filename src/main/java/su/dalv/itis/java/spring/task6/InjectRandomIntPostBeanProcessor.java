package su.dalv.itis.java.spring.task6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Random;


public class InjectRandomIntPostBeanProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Field[] methods = o.getClass().getFields();
        for (Field field : methods) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if(annotation!=null){
                Random random = new Random();
                int i = random.nextInt(annotation.max() - annotation.min());
                i = i+annotation.min();
                try {
                    field.setInt(o,i);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
