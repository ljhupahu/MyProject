package com.my.design.proxy.staticProxy;

/**
 * Created by jli on 3/21/2018.
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
