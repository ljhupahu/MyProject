package com.my.shiro.eventbus;

import org.apache.shiro.event.Subscribe;

/**
 * Created by Jet on 2017/11/26.
 */
public class Register {

    @Subscribe
    public void say(String str) {
        System.out.println("====say===");
    }
}
