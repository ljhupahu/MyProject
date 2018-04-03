package com.my.design.proxy.dynamicProxy2;

/**
 * Created by jli on 3/22/2018.
 * https://book.2cto.com/201301/14116.html
 */
public class Client {
    public static void main(String[] args) {
        Greet1Impl greet1 = new Greet1Impl();
        Greet2 greet2 = GreetFactory.adaptGreet(greet1);
        greet2.greet("t");
    }
}
