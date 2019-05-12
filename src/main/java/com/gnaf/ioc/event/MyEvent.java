package com.gnaf.ioc.event;

import java.util.EventObject;

/**
 * @author Derek
 * @date 2019/4/21 12:26
 */
public class MyEvent extends EventObject {

    private String name;

    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
