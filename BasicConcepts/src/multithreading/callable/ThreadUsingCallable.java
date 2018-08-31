package multithreading.callable;


import java.util.concurrent.*;

public class ThreadUsingCallable implements Callable<Object> {


    @Override
    public Object call() throws Exception {

        System.out.println("Inside call");
        return null;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadUsingCallable threadUsingCallable = new ThreadUsingCallable();
        ThreadUsingRunnable threadUsingRunnable = new ThreadUsingRunnable();

        Thread t1 = new Thread(threadUsingRunnable);
        t1.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(threadUsingCallable);

        String a = "Kapil";
        System.out.println(a.hashCode());
        StringBuilder c = new StringBuilder(14).append(a).append("DEV");
        System.out.println(c.toString());


        FutureTask<Object> futureTask = new FutureTask<>(threadUsingCallable);

        futureTask.run();
        System.out.println(futureTask.get(1000, TimeUnit.MILLISECONDS));

        FutureTask<Boolean> ft1 = new FutureTask<>(threadUsingRunnable, true);
        ft1.run();
        try {
            System.out.println(ft1.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class ThreadUsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run");
    }
}

