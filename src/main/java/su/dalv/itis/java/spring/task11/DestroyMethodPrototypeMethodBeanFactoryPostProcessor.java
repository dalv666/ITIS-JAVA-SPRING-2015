package su.dalv.itis.java.spring.task11;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;


public class DestroyMethodPrototypeMethodBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            GenericBeanDefinition beanDefinition = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            if(beanDefinition.isPrototype() && beanDefinition.getDestroyMethodName()!=null){
                System.err.println("WARN: PROTOTYPE BEAN CAN NOT BE DESTROYED");
            }

        }
    }
}
