public class DisplayMessage {

    public void sayHello(String name) {
        synchronized (DisplayMessage.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello World" + name);
            }
        }
    }
}
