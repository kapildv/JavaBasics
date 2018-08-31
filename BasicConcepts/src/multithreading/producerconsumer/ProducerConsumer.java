package multithreading.producerconsumer;

import java.util.LinkedList;

public class ProducerConsumer {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int capacity = 2;

    private void produce() {
        int value = 0;
        while (list.size() >= capacity||list.size()<=capacity)
            synchronized (this) {
                while (list.size() == capacity) {
                    try {
//                        value = 0;
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer produces - " + value);
                list.add(value++);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    private void consume() {
        while (list.size() >= capacity||list.size()<=capacity) {
            synchronized (this) {
                while (list.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = list.removeFirst();
                System.out.println("Consuemr consumes - " + value);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();


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

    public static void main(String[] args, Integer[] inter) {

    }
}
