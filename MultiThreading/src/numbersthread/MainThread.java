package numbersthread;

public class MainThread {
    public static void main(String[] args) {
        EvenNumbersThread evenNumbersThread = new EvenNumbersThread();
        OddNumbersThread oddNumbersThread = new OddNumbersThread();
        evenNumbersThread.start();
        oddNumbersThread.start();
    }
}
