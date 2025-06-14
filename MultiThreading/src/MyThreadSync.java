public class MyThreadSync extends Thread {
//    DisplayMessage dm;
    String name;
//    MyThreadSync(DisplayMessage dm, String name) {
//        this.dm = dm;
//        this.name = name;
//    }
    MyThreadSync(String name) {
        this.name = name;
    }
    public void run() {
        DisplayMessage dm = new DisplayMessage();
        dm.sayHello(name);
    }
}
