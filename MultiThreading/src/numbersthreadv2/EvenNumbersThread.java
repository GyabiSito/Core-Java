package numbersthreadv2;

public class EvenNumbersThread extends Thread implements Runnable {
    private final Object lock;
    private final NumberPrinter printer;

    EvenNumbersThread(Object lock, NumberPrinter printer) {
        this.lock = lock;
        this.printer = printer;
    }

    @Override
    public synchronized void run() {
        while(printer.number <= 10){
            synchronized(lock){
                while(!printer.evenTurn){
                    try{
                        lock.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                if(printer.number <=10 && printer.number % 2 == 0){
                    System.out.println(printer.number);
                    printer.number++;
                    printer.evenTurn=false;
                    lock.notify();

                }
            }
        }
    }
}
