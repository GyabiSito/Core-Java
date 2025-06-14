package MethodRef;

public class MethodRefDemo {
    public static void myMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Runnable r = MethodRefDemo::myMethod;
        Thread t1=new Thread(r);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Parent Thread");
        }
    }
}
