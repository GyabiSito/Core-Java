public class NumberFormatException {
    public static void main(String[] args) {
        String s="abcd";
        try {
            int i=Integer.parseInt(s);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Error parsing string");
        }
    }
}
