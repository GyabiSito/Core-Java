public class ThrowKeyword {
    public static void main(String[] args) {
//        throw new RuntimeException("Hello World");
        try {
            throw new Exception("E");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
