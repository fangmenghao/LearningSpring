package com.gnaf.ioc.event;

/**
 * @author Derek
 * @date 2019/4/21 12:29
 */
public class SimpleMyEventListener implements MyEventListener {
    public void onMethodBegin(MyEvent event) {
        System.out.println("Start event handle: " + event.getName());
    }

    public void onMethodEnd(MyEvent event) {
        System.out.println("End event handle: " + event.getName());
    }
}
