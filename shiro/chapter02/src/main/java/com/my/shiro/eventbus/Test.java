package com.my.shiro.eventbus;

import java.util.LinkedList;

/**
 * Created by jli on 1/21/2018.
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add(null);
        list.add("b");

        for (String str: list) {
            System.out.println(str);
        }
    }

}
