public class StackOverflow {
    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        System.out.println("Method 1");
        method2();
    }
    public static void method2() {
        System.out.println("Method 2");
        method1();
    }
}
