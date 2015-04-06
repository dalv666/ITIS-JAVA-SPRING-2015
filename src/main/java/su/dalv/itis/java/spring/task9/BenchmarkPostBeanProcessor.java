package su.dalv.itis.java.spring.task9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class BenchmarkPostBeanProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(final Object o, String s) throws BeansException {
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnObject;
                if (o.getClass().getMethod(method.getName()).getAnnotation(Benchmark.class) != null) {
                    long start = System.currentTimeMillis();
                    returnObject = method.invoke(o, args);
                    System.out.println("Method invocation duration " + (System.currentTimeMillis() - start));
                    return returnObject;
                }
                returnObject = method.invoke(o, args);
                return returnObject;
            }
        });
    }

    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        return o;
    }
}
