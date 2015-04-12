package su.dalv.itis.java.spring.task20;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import su.dalv.itis.java.spring.task20.client.ClientConfig;
import su.dalv.itis.java.spring.task20.server.ServerConfig;

public class Test {

    public static boolean isStop = true;

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext serverConfig = new AnnotationConfigApplicationContext(ServerConfig.class);
        Thread.sleep(5000);
        AnnotationConfigApplicationContext clientConfig = new AnnotationConfigApplicationContext(ClientConfig.class);
        Greeting greeting = (Greeting) clientConfig.getBean(Greeting.class);
        greeting.greet();
        clientConfig.close();
        serverConfig.close();
    }
}
