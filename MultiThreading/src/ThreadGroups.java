import java.lang.ThreadGroup;

public class ThreadGroups {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("Group");
        CustomThread t1=new CustomThread(group,"t1");
        CustomThread t2=new CustomThread(group,"t2");
        CustomThread t3=new CustomThread(group,"t3");
        t1.start();
        t2.start();
        t3.start();

        System.out.println(group.activeCount());

        group.list();
    }
}
