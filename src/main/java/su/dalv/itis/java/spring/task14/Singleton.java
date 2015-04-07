package su.dalv.itis.java.spring.task14;


public class Singleton {
    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    private Prototype prototype;

    public String usePrototype(){
        return prototype.getInfo();
    }
}
