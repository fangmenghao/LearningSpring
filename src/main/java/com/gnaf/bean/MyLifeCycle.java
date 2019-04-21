package com.gnaf.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Derek
 * @date 2019/4/20 20:26
 */
public class MyLifeCycle implements InitializingBean, DisposableBean {

    public MyLifeCycle() {
        System.out.println("MyLifeCycle constructor");
    }

    public void init() {
        System.out.println("MyLifeCycle init");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("MyLifeCycle afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("MyLifeCycle DisposableBean");
    }
}
