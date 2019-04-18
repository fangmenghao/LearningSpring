package com.gnaf.ioc;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Derek
 * @date 2019/4/17 22:31
 */
public class TestRegisterScope {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader configReader = new XmlBeanDefinitionReader(beanFactory);
        configReader.loadBeanDefinitions(new ClassPathResource("TestScope.xml"));

        // 如何注册自定义Scope
        beanFactory.registerScope("myScope", new MyScope());

    }

    private static class MyScope implements Scope {

        public Object get(String s, ObjectFactory<?> objectFactory) {
            return null;
        }

        public Object remove(String s) {
            return null;
        }

        public void registerDestructionCallback(String s, Runnable runnable) {

        }

        public Object resolveContextualObject(String s) {
            return null;
        }

        public String getConversationId() {
            return null;
        }
    }

}
