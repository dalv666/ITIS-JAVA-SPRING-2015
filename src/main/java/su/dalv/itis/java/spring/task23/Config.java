package su.dalv.itis.java.spring.task23;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan(basePackages = "su.dalv.itis.java.spring.task23")
public class Config {

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public Credential credential(){
        return new Credential("VeryLongName","Name","Pass");
    }

}
