package resources;

public class MyWorker implements AutoCloseable {
    MyWorker(){
        System.out.println("Creating resource");
    }

    public void doSomething(){
        System.out.println("Do something");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
