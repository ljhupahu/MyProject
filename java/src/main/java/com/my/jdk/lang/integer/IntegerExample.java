package com.my.jdk.lang.integer;

/**
 * Created by jli on 3/27/2018.
 */
public class IntegerExample {

    public static void main(String[] args) {
        integerInt();
    }

    /**
     * 非new生成的Integer变量和new Integer()生成的变量比较时，结果为false
     * 因为非new生成的Integer变量指向的是java常量池中的对象，而new Integer()生成的变量指向堆中新建的对象，
     * 两者在内存中的地址不同
     */
    public static void integerInt() {
        Integer i = new Integer(100);

        Integer j = 100;
        Integer k = 100;
        System.out.println(i == j); //false
        System.out.println(k == j); //true


        Integer x = new Integer(100);
        Integer y = new Integer(100);

        System.out.println(x.equals(y));
        System.out.println(x == y);
    }
}
