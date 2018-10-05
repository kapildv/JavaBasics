package multithreading.syncronizeblock;

public class SyncronizeBlock {
    int value;

    private void add() {
        synchronized (this) {
            value++;
        }
        System.out.println(Thread.currentThread().getName() + " " + value);
    }

    private synchronized void addition() {
        value++;
        System.out.println(Thread.currentThread().getName() + " " + value);
    }

    public static void main(String[] args) {
        SyncronizeBlock block = new SyncronizeBlock();
        SyncronizeBlock block1 = new SyncronizeBlock();

        Thread t1 = new Thread(block::add);
        Thread t2 = new Thread(block::add);
        Thread t3 = new Thread(block::addition);
        Thread t4 = new Thread(block1::addition);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
