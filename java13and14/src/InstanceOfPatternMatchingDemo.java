public class InstanceOfPatternMatchingDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Object valor = InstanceOfPatternMatchingDemo.get();
        if (obj instanceof String str) {
            System.out.println(str);
        }
    }
    public static Object get(){
        return "Pattern matching in action";
    }
}
