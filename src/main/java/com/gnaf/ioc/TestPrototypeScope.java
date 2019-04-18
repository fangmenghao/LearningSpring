package com.gnaf.ioc;

import com.gnaf.bean.Foo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Derek
 * @date 2019/4/17 22:19
 */
public class TestPrototypeScope {

    public static void main(String[] args) {

        // 通过BeanDefinitionReader读取了配置
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader configReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        configReader.loadBeanDefinitions(new ClassPathResource("TestScope.xml"));

        // 配置了scope为prototype
        Foo foo1 = (Foo) beanFactory.getBean("foo");
        Foo foo2 = (Foo) beanFactory.getBean("foo");

        System.out.println(foo1);
        System.out.println(foo2);

    }


}
