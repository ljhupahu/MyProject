package com.my.design.proxy.dynamicProxy;

/**
 * Created by jli on 3/21/2018.
 * https://www.cnblogs.com/lfdingye/p/7717063.html
 */
public class Client {
    public static void main(String[] args) {
        OrderApi instance = (OrderApi) new DynamicProxy().getInstance(new Order());
        instance.getOrderUser();
    }
}
