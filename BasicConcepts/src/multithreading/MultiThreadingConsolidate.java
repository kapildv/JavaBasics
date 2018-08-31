package multithreading;

public class MultiThreadingConsolidate implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Helper helper = new Helper();
        MultiThreadingConsolidate consolidate = new MultiThreadingConsolidate();

        Thread t1 = new Thread(helper);
        Thread t2 = new Thread(consolidate);

        t1.run();
        t2.run();

        ClassLoader loader = t1.getContextClassLoader();
        Thread t3 = new Thread(new Helper());

        System.out.println("No of active Thread Count " + Thread.activeCount());
        System.out.println("Is Thread Alive : " + Thread.currentThread());

        t1.checkAccess();

        System.out.println("Thread State : " + t2.getState());

        t2 = new Thread(consolidate);
        t2.start();
        t2.interrupt();
        System.out.println("Is thread2 interrupted? " + t2.isInterrupted());
        System.out.println("Is thread2 alive? " + t2.isAlive());

        t1 = new Thread(helper);
        t1.setDaemon(true);
        System.out.println("Is thread1 a daemon thread? " + t1.isDaemon());
        System.out.println("Is thread1 interrupted? " + t1.isInterrupted());

        System.out.println("ToString (Thread Name : Thread Priority : Thread Group ): " + t1.toString());
    }
}

class Helper implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("thread2 going to sleep for 5000");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}