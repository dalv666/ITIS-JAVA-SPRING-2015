package su.dalv.itis.java.spring.task22;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class Driver {

    @NotNull
    private String name;

    @DecimalMin("18")
    private int age;

    public Driver(int age, boolean isDring, String name) {
        this.age = age;
        this.isDring = isDring;
        this.name = name;
    }

    public Driver() {
        super();
    }

    @AssertFalse
    private boolean isDring;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDring() {
        return isDring;
    }

    public void setIsDring(boolean isDring) {
        this.isDring = isDring;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isDring=" + isDring +
                '}';
    }
}
