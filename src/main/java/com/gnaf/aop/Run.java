package com.gnaf.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Derek
 * @date 2019/5/12 9:13
 */
public class Run {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Foo foo = context.getBean(Foo.class);

        foo.action1();
        foo.action2();
        foo.action3();
        foo.action4(2);
        foo.action5();
    }

}
