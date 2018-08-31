package multithreading.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PcDriver {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        Thread tp = new Thread(producer);
        Thread tc = new Thread(consumer);

        tp.start();
        tc.start();

//        try {
//            tp.join();
//            tc.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
