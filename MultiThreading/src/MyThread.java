public class MyThread extends Thread {
    public void run() {
//        Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
        }
    }
}
