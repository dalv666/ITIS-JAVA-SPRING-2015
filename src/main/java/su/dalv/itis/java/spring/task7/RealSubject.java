package su.dalv.itis.java.spring.task7;

public class RealSubject implements Subject {

    public int longMethod() {
        int g = 0;
        for (int i = 0; i < 5; i++) {
            g++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return g;
    }
}
