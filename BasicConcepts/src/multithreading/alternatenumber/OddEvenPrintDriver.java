package multithreading.alternatenumber;

public class OddEvenPrintDriver {

    private boolean odd = false;
    private int count = 1;
    private final int MAX = 30;

    private void printEven() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
        synchronized (this) {
            while (count < MAX) {
                while (odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                odd = true;
                notify();
            }
        }

    }

    private void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                while (!odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                odd = false;
                notify();
            }
        }

    }

    public static void main(String[] args) {

        OddEvenPrintDriver od = new OddEvenPrintDriver();
        od.odd = true;

        Thread t1 = new Thread(od::printOdd);
        Thread t2 = new Thread(od::printEven);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
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
