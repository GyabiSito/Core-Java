package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {

        List<Integer> l1=new ArrayList<Integer>();

        for (int i=1;i<=10;i++){
            l1.add(i);
        }

//        List<Integer> l2=new ArrayList<>();
//        for (Integer i : l1) {
//            if(i%2==0){
//                l2.add(i);
//            }
//        }
        List<Integer> l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
