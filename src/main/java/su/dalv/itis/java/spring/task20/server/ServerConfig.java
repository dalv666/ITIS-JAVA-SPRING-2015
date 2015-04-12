package su.dalv.itis.java.spring.task20.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import su.dalv.itis.java.spring.task20.Greeting;

@Configuration
@ComponentScan(basePackages = "su.dalv.itis.java.spring.task20.server")
public class ServerConfig {

    @Bean
    public Greeting greeting() {
        return new GreetingImpl();
    }


    @Bean
    public RmiServiceExporter rmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("GreetingServices");
        rmiServiceExporter.setService(greeting());
        rmiServiceExporter.setServiceInterface(Greeting.class);
        rmiServiceExporter.setRegistryPort(6060);
        return rmiServiceExporter;
    }
}
