package threadcommunication;

public class MyThread extends Thread {
    int total;

    @Override
    public void run() {
        System.out.println("Child calculating usm");
        synchronized (this) {
            for (int i = 0; i < 50; i++) {
                total += i;
            }
            this.notify();
        }
    }
}
