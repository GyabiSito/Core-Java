import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        MyCallable[] callables = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60),
                new MyCallable(70),
                new MyCallable(80),
                new MyCallable(90),
                new MyCallable(90)
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (MyCallable myCallable : callables) {
            Future<Integer> future = executorService.submit(myCallable);
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        }
        executorService.shutdown();
    }
}
