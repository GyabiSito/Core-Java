package MethodRef.constructor;

public class MyClass {
    private String s;

    MyClass(String s) {
        this.s = s;
        System.out.println("inside the constructor" + s);
    }
}
