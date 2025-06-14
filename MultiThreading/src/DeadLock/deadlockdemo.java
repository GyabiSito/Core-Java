package DeadLock;

public class deadlockdemo implements Runnable {
    FirstResource fr = new FirstResource();
    SecondResource sr = new SecondResource();

    public deadlockdemo() {
        new Thread(this).start();
        sr.method1(fr);
    }
    public static void main(String[] args) {
        new deadlockdemo();
    }
    @Override
    public void run() {
        fr.method1(sr);
    }
}
