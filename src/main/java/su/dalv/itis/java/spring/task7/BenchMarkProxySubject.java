package su.dalv.itis.java.spring.task7;


public class BenchMarkProxySubject implements Subject {

    private Subject subject;

    public BenchMarkProxySubject() {
        subject  = new RealSubject();
    }

    public int longMethod() {
        long starTime = System.currentTimeMillis();
        int startTime = subject.longMethod();
        System.out.println("Method invocation duration " + (System.currentTimeMillis() - starTime));
        return startTime;
    }
}
