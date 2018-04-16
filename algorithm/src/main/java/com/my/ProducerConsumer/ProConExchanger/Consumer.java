package com.my.ProducerConsumer.ProConExchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by jli on 4/2/2018.
 */
public class Consumer implements Runnable {
    private List<String> buffer;

    private final Exchanger<List<String>> exchanger;

    public Consumer(List<String> buffer, Exchanger<List<String>> exchanger) {
        this.buffer = buffer;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        int cycle = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Consumer : Cycle :" + cycle);
            try {
                //调用exchange()与消费者进行数据交换try {
                buffer = exchanger.exchange(buffer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Consumer :" + buffer.size());
            for (int j = 0; j < 10; j++) {
                System.out.println("Consumer : " + buffer.get(0));
                buffer.remove(0);
            }
            cycle++;
        }
    }
}
