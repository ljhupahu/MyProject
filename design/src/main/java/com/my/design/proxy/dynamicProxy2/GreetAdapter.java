package com.my.design.proxy.dynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jli on 3/22/2018.
 */
public class GreetAdapter implements InvocationHandler {

    private Greet1 greet1;

    public GreetAdapter(Greet1 greet1) {
        this.greet1 = greet1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        String methodName = method.getName();
        if ("greet".equals(methodName)) {
            String userName = (String) args[0];
            String name = findName(userName);
            String gender = findGender(userName);
            try {
                Method greetMethod1 = Greet1.class.getMethod(methodName, new Class<?>[]{String.class, String.class});
                return greetMethod1.invoke(greet1, new Object[]{name, gender});
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        } else {
            return method.invoke(greet1, args);
        }
    }

    private String findGender(String name) {
        return Math.random() > 0.5 ? name : null;
    }

    private String findName(String name) {
        return name;
    }
}
