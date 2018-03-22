package com.my.design.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jli on 3/21/2018.
 */
public class DynamicProxy implements InvocationHandler {

    private OrderApi target;

    public Object getInstance(OrderApi target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("on");
        Object object = method.invoke(target, args);
        System.out.println("off");
        return object;
    }
}
