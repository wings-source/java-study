package day3.producer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        testProducer();
        List list = Collections.synchronizedList(new LinkedList());
    }

    private static void testProducer() {

        ProductBuffer buffer = new ProductBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

//        try {
//            producerThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("main 结束");
    }
}
