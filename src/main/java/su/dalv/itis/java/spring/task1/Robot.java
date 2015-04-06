package su.dalv.itis.java.spring.task1;

public class Robot {

    @Override
    public String toString() {
        return "Robot{}";
    }

    @RunThisMethod(repeat = 10)
    public void saySmth(){
        System.out.println("I say smth");
    }


    public void clean(){
        System.out.println("Cleaning");
    }
}
