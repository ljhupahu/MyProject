package com.my.ProducerConsumer.ProConMy;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jli on 3/29/2018.
 */
public class Producer implements Runnable {

    private List<Integer> list;
    private ReentrantLock lock;
    private Condition condition;

    public Producer(List<Integer> list, ReentrantLock lock, Condition condition) {
        this.list = list;
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try {
            while (true) {
                lock.lock();
                if (list.size() != 0) {
                    condition.await();
                } else {
                    Random random = new Random();
                    list.add(random.nextInt());
                    System.out.println("put" + list.get(0));
                    condition.signalAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
