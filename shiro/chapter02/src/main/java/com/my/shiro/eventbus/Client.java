package com.my.shiro.eventbus;

import org.apache.shiro.event.EventBus;
import org.apache.shiro.event.support.DefaultEventBus;

/**
 * Created by Jet on 2017/11/25.
 */
public class Client {
    public static void main(String[] args) {
        EventBus eventBus = new DefaultEventBus();
        eventBus.register(new Register());
        eventBus.publish("a");
    }
}
