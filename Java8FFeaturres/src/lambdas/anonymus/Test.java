package lambdas.anonymus;

public class Test {
    public static void main(String[] args) {

//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Child thread");
//                }
//            }
//        });
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread");
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Parent thread");
        }
    }
}
