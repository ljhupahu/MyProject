package com.my.design.proxy.dynamicProxy2;

import java.lang.reflect.Proxy;

/**
 * Created by jli on 3/22/2018.
 */
public class GreetFactory {
    public static Greet2 adaptGreet(Greet1 greet1) {
        GreetAdapter adapter = new GreetAdapter(greet1);
        ClassLoader c1 = greet1.getClass().getClassLoader();
        return (Greet2) Proxy.newProxyInstance(c1, new Class<?>[]{Greet2.class}, adapter);
    }
}
