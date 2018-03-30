package com.my.ProducerConsumer.ProConMy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jli on 3/29/2018.
 */
public class Client {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        List<Integer> list = new ArrayList<>();

        Consumer consumer = new Consumer(list, reentrantLock, condition);
        Producer producer = new Producer(list, reentrantLock, condition);

        for (int i = 0; i < 10; i++) {
            new Thread(consumer).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(producer).start();
        }
    }
}
