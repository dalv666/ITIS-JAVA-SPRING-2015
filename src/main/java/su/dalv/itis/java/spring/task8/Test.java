package su.dalv.itis.java.spring.task8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new InvocationHandler() {
            private RealSubject realSubject = new RealSubject();
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long startTime = System.currentTimeMillis();
                Object invoke = method.invoke(realSubject);
                System.out.println("Time proxy invocation is " + (System.currentTimeMillis() - startTime));
                return invoke;
            }
        });
        subject.longMethod();
    }
}
