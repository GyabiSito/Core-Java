public class SyncronizationDemo {
    public static void main(String[] args) {
        DisplayMessage display = new DisplayMessage();
//        MyThreadSync t1 = new MyThreadSync(display,"Steve");
//        MyThreadSync t2 = new MyThreadSync(display,"Mark");
        MyThreadSync t1 = new MyThreadSync("Mark");
        MyThreadSync t2 = new MyThreadSync("Mark2");

        t1.start();
        t2.start();
    }
}
