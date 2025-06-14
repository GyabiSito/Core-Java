package DeadLock;

public class FirstResource {
    public synchronized void method1(SecondResource secondResource) {
        System.out.println("Inside method 1 of FR");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Invoking method 2 of FR");
        secondResource.method2();
    }
    public synchronized void method2() {
        System.out.println("Inside method 2 of FR");
    }
}
