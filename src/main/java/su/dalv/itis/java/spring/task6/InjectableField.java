package su.dalv.itis.java.spring.task6;


public class InjectableField {

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    @InjectRandomInt(min = 40,max = 90)
    public int randomInt;

}
