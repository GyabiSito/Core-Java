package numbersthread;

public class OddNumbersThread extends Thread implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        this.notify();
    }

}
