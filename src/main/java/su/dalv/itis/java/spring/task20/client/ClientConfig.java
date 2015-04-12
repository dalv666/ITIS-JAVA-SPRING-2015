package su.dalv.itis.java.spring.task20.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import su.dalv.itis.java.spring.task20.Greeting;

@Configuration
@ComponentScan(basePackages = "su.dalv.itis.java.spring.task20.client")
public class ClientConfig {

    @Bean
    public RmiProxyFactoryBean proxyFactoryBean(){
        RmiProxyFactoryBean proxyFactoryBean = new RmiProxyFactoryBean();
        proxyFactoryBean.setServiceUrl("rmi://localhost:6060/GreetingServices");
        proxyFactoryBean.setServiceInterface(Greeting.class);
        return proxyFactoryBean;
    }


}
