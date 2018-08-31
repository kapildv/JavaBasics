package multithreading.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

    private BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();


    private void produce() {
        final int capacity = 20;
        int value = 0;
        while (true) {
            System.out.println("Producer produces : " + value);
            blockingQueue.add(value++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void consume() {
        while (true) {
            try {
                System.out.println("Consumer consumes : " + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumerUsingBlockingQueue pc = new ProducerConsumerUsingBlockingQueue();
        Thread t1 = new Thread(pc::produce);
        Thread t2 = new Thread(pc::consume);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
