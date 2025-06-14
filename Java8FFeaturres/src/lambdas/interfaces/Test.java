package lambdas.interfaces;

public class Test {
    public static void main(String[] args) {
//        Runnable runnable =new MyRunnableImpl();
//        Thread thread = new Thread(runnable);
//        thread.start();
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i = 0; i<10; i++){
            System.out.println("Main thread");
        }
    }
}
