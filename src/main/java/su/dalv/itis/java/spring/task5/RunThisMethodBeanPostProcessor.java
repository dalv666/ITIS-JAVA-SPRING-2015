package su.dalv.itis.java.spring.task5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class RunThisMethodBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null) {
                int repeat = annotation.repeat();
                try {
                    for (int i = 0; i < repeat; i++) {
                        method.invoke(o);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
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
