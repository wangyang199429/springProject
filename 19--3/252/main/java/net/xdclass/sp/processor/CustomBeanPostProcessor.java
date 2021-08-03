package net.xdclass.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor implements BeanPostProcessor,Ordered {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("CustomBeanPostProcessor1 postProcessBeforeInitialization beanName="+beanName);

        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor1 postProcessAfterInitialization beanName="+beanName);
        return bean;
    }


    public int getOrder() {
        return 1;
    }
}
