package LocalInner;

public class Outer {
    void f1() {
        System.out.println("Inside f1");
        class LocalInner {
            void f2() {
                System.out.println("LocalInner f2");
            }
        }
        LocalInner l = new LocalInner();
        l.f2();
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.f1();
    }

}
