package threadcommunication;

public class MyThrad {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        synchronized (t) {
            System.out.println("main thread is going to wait");
            t.wait();
            System.out.println("main thread notified");
            System.out.println(t.total);
        }
    }
}
