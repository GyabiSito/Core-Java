package MethodRef;

public class MYClass {
    public void myMethod123(int i) {
        System.out.println(i + "   hola");
    }

    public static void main(String[] args) {
        MYInterface f = i->System.out.println(i);
        f.mymethod(10);

        MYClass c=new MYClass();
        MYInterface f1=c::myMethod123;
        f1.mymethod(20);
    }
}
