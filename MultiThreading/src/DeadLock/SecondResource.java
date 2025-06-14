package DeadLock;

public class SecondResource {
    public synchronized void method1(FirstResource firstResource) {
        System.out.println("Inside method1 of SR");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Invoking method 2 of SR");
        firstResource.method2();
    }
    public synchronized void method2() {
        System.out.println("Inside method2 of SR");
    }
}
