import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n,sum=0;
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        System.out.println("Sum first N numbers, enter a value");
        Scanner sc = new Scanner(System.in);
        JoinDemo.n = sc.nextInt();
        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sumja de los " + JoinDemo.n  + " Es " + JoinDemo.sum);
        long end=System.currentTimeMillis();
        System.out.println("Total time: " + (end-start) / 1000);
    }
    public void run(){
        for(int i=0;i<n;i++){
            JoinDemo.sum+=i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

