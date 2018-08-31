package multithreading;

public class Demo {

    private boolean isOdd = false;
    private static int count = 0;
    private static int MAX = 20;

    private void printEven() {
        synchronized (this) {
            while (count < MAX) {
                while (!isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                isOdd = false;
                notify();
            }
        }

    }

    private void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                while (isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                isOdd = true;
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        demo.isOdd = false;

        Thread t1 = new Thread(demo::printOdd);
        Thread t2 = new Thread(demo::printEven);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }

}