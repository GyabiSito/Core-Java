package numbersthreadv2;

import numbersthreadv2.NumberPrinter;

public class MainThread {
    public static void main(String[] args) {
        Object lock = new Object();

        NumberPrinter printer = new NumberPrinter();

        Thread evenThread = new Thread(new EvenNumbersThread(lock, printer));
        Thread oddThread = new Thread(new OddNumbersThread(lock, printer));

        evenThread.start();
        oddThread.start();
    }
}
