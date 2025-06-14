public class ThreadGroup {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName()); //Main
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //System
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getParent().getName()); //NULL POINTER EXCEPTION, no hay nada mas alla de System

        java.lang.ThreadGroup parent = new java.lang.ThreadGroup("parent");
        System.out.println(parent.getName());
        java.lang.ThreadGroup child = new java.lang.ThreadGroup("child");
        System.out.println(child.getName());
        System.out.println(child.getParent().getName());

        Thread t1=new Thread(child,"Thread 1");
        Thread t2=new Thread(child,"Thread 2");
        System.out.println(t1.getThreadGroup().getName());
    }
}
