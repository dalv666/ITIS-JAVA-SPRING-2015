package su.dalv.itis.java.spring.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ObjectFactory {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class aClass = Class.forName(args[0]);
        Object instance = aClass.newInstance();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null) {
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    method.invoke(instance);
                }
            }

        }
    }
}
