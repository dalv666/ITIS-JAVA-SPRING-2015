package su.dalv.itis.java.spring.task18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Component
public class PostInitializedTrigger implements ApplicationListener<ContextRefreshedEvent> {

    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = context.getBean(beanDefinitionName);
            Method[] methods = bean.getClass().getMethods();
            for (Method method : methods) {
                if (method.getAnnotation(PostInitialized.class) != null) {
                    try {
                        method.invoke(bean);
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        }
    }
}
