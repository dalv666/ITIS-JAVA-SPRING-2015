package su.dalv.itis.java.spring.task10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TransactionBeanPostProcessor implements BeanPostProcessor {

    private List<String> classes = new ArrayList<String>();

    public Object postProcessBeforeInitialization(final Object o, String s) throws BeansException {
        if (o.getClass().getAnnotation(Transaction.class) != null) {
            classes.add(s);
        }
        return o;
    }

    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        if (classes.contains(s)) {
            return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("Transaction start");
                    Object invoke = method.invoke(o, args);
                    System.out.println("Transaction end");
                    return invoke;
                }
            });
        } else {
            return o;
        }
    }
}
