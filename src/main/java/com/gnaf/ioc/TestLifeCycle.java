package com.gnaf.ioc;

import com.gnaf.bean.MyLifeCycle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Derek
 * @date 2019/4/20 20:26
 */
public class TestLifeCycle {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("lifeCycle.xml");
        MyLifeCycle bean = beanFactory.getBean(MyLifeCycle.class);

        // 测试afterPropertiesSet和init-method谁先执行
        // 结果：afterPropertiesSet先执行，如果init-method配置成afterPropertiesSet，则只执行一遍

        // 需要调用close才会执行DisposableBean和destroy-method
//        beanFactory.close();
        beanFactory.registerShutdownHook();
    }

}
