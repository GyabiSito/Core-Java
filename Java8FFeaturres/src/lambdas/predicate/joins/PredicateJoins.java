package lambdas.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {

        int[] x = {1,2,3,4,5,6,7,8,9,10};
        Predicate<Integer> p1 = i -> (i > 5);
        Predicate<Integer> p2 = i -> (i % 2 == 0);
        System.out.println("Greater than 5");
        method1(p1,x);
        System.out.println("Even numbers");
        method1(p2,x);

        System.out.println("Not greater than 5");
        method1(p1.negate(),x);

        System.out.println("Greather tan 10 AND even");
        method1(p1.and(p2),x);
        System.out.println("Greater or even");
        method1(p1.or(p2),x);
    }

    static void method1(Predicate<Integer> p,int[] x ){
        for(int i=0;i<x.length;i++){
            if(p.test(x[i])){
                System.out.println(x[i]);
            }
        }
    }
}
