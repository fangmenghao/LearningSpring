package com.gnaf.ioc.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Derek
 * @date 2019/4/21 12:30
 */
public class MyEventPublisher {

    private List<MyEventListener> listeners = new ArrayList<MyEventListener>();

    public void methodToMonitor() {
        MyEvent event = new MyEvent(this, "methodToMonitor");

        publishEvent(0, event);

        // do business

        publishEvent(1, event);
    }

    protected void publishEvent(int status, MyEvent event) {
        List<MyEventListener> copyListeners = new ArrayList<MyEventListener>(listeners);
        for (MyEventListener copyListener : copyListeners) {
            if (status == 0) {
                copyListener.onMethodBegin(event);
            } else {
                copyListener.onMethodEnd(event);
            }
        }
    }

    public void addListener() {

    }

    public void removeListener() {

    }



}
