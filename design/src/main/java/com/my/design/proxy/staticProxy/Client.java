package com.my.design.proxy.staticProxy;

/**
 * Created by jli on 3/21/2018.
 * http://www.cnblogs.com/cenyu/p/6289209.html
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
//代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();//执行的是代理的方法
    }

}
