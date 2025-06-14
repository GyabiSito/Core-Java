public class CheckProcessor implements Runnable {
    String name;
    CheckProcessor(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " is running" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " is stopped" + Thread.currentThread().getName());
    }
}
