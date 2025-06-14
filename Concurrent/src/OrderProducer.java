import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {
    private BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run()  {
        try {
            queue.put("Mcbook pro");
            queue.put("Laptop");
            queue.put("IPhone");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
