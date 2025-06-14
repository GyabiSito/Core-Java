public class Test {
    public static void main(String[] args) {

        MyGenericClass<String> s = new MyGenericClass<>("Sapo");
        s.displayObjectDetails();
        System.out.println(s.getObject());

        MyGenericClass<Integer> i = new MyGenericClass<>(1);
        i.displayObjectDetails();
        System.out.println(i.getObject());

        MyGenericClass<Double> d = new MyGenericClass<>(1.0);
        d.displayObjectDetails();
        System.out.println(d.getObject());
    }
}
