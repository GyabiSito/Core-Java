public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(12); // IllegalArgument
    }
}
