public class InterruptDemo extends Thread {
    public static void main(String[] args) {
        Interrupt t = new Interrupt();
        t.start();
        t.interrupt();
        System.out.println("End of the main method");
    }
}
