package multithreading.miscellaneous;

import javafx.scene.control.Alert;

public class AlternateNumber {
    int count = 1;
    int MAX = 20;
    boolean isOdd = false;

    private void printOdd() {

        while (count < MAX) {
            synchronized (this) {
                while (isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count++);
                isOdd = true;
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }

    private void printEven() {

        while (count < MAX) {
            synchronized (this) {
                while (!isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count++);
                isOdd = false;
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();

            }
        }
    }

    public static void main(String[] args) {
        AlternateNumber alternateNumber = new AlternateNumber();

        Thread t1 = new Thread(alternateNumber::printEven);
        Thread t2 = new Thread(alternateNumber::printOdd);

        t1.setName("Thread-2");
        t2.setName("Thread-1");

        t1.start();
        t2.start();
    }
}
