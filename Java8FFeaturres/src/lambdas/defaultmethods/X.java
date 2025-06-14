package lambdas.defaultmethods;

public interface X {
    default void m1(){
        System.out.println("inside X");
    }
}
