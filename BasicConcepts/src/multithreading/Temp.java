package multithreading;

import java.io.BufferedReader;
import java.util.concurrent.*;

public class Temp implements Cloneable {

    public static void main(String[] args) {
        System.out.println("Thread : " + Thread.currentThread().getId());
        System.out.println("Thread Count : " + Thread.activeCount());
        Thread t1 = new Thread(new TempThread());
        t1.start();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new ThreadUsingCallable());
        executorService.shutdown();

        FutureTask<String> futureTask = new FutureTask<>(new ThreadUsingCallable());
        try {
            futureTask.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            futureTask.cancel(true);
            e.printStackTrace();
        }
    }
}

class TempThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside Runnable Thread");
    }
}

class ThreadUsingCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Inside Callable Thread");
        return null;
    }
}
