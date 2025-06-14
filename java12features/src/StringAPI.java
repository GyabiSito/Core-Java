public class StringAPI {
    public static void main(String[] args) {
        String s = "All the power is with in you. you can do and evertyything!!";
        System.out.println(s.indent(5));

        String s1="123";
        Integer result=s1.transform(Integer::parseInt);
        System.out.println(result);
    }
}
