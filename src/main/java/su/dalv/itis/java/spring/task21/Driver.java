package su.dalv.itis.java.spring.task21;

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

}
