package NonStaticInner;

public class Outer {
    private static int x=50;
    private int y;
    Outer(int y) {
        this.y = y;
    }
    void f1(){
        System.out.println("Outter Classes non static method");
    }

    class Inner{
        private int y;
        Inner(int y) {
            this.y = y;
        }

        void f2(){
            System.out.println("Outer classes X"  + Outer.x);
            System.out.println("Outer classes Y"  + Outer.this.y);
            System.out.println("Inner classes Y"  + this.y);
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer(80);
        outer.f1();

        Outer.Inner inner = outer.new Inner(30);
        inner.f2();
        System.out.println(inner.y);
    }
}
