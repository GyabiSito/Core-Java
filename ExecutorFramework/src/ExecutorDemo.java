import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        CheckProcessor[] cps = {
                new CheckProcessor("ATM"),
                new CheckProcessor("Bank"),
                new CheckProcessor("Mobile"),
                new CheckProcessor("Phone"),
            };
        ExecutorService es = Executors.newFixedThreadPool(2);
        for (CheckProcessor cp : cps) {
            es.submit(cp);
        }

        es.shutdown();
    }
}
