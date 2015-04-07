package su.dalv.itis.java.spring.task12;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;

public class DeprecatedBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            try {
                Class<?> aClass = Class.forName(genericBeanDefinition.getBeanClassName());
                Deprecated annotation = aClass.getAnnotation(Deprecated.class);
                if(annotation!=null){
                    if(annotation.newClass()!=null){
                        genericBeanDefinition.setBeanClassName(annotation.newClass().getName());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
