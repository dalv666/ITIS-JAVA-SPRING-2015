package su.dalv.itis.java.spring.task5;


public class RunnableMethod {

    @RunThisMethod(repeat = 3)
    public void runMe(){
        System.out.println("You run me");
    }

}
