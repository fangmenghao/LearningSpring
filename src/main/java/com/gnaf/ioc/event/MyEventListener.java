package com.gnaf.ioc.event;

import java.util.EventListener;

/**
 * @author Derek
 * @date 2019/4/21 12:28
 */
public interface MyEventListener extends EventListener {

    void onMethodBegin(MyEvent event);

    void onMethodEnd(MyEvent event);

}
