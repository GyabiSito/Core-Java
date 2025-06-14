public class Interrupt extends Thread {
    public void run() {
        try{

        for (int i = 0; i < 10; i++) {
            System.out.println("Im a lazy methdo");
            Thread.sleep(2000);
        }
        }catch(InterruptedException e){
            System.out.println("Got interrupted");
        }
    }
}
