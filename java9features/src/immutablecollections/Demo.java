package immutablecollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        List<String> list=List.of("a", "b", "c", "d", "e", "f", "g", "h"); //Tampoco null
        Set<String> set=Set.of("a", "b", "c", "d", "e", "f", "g");
        Map<Integer,String>  map =Map.of(1,"a",2,"b",3,"c",4,"d",5,"e",6,"f",7,"g",8,"h");
        //list.add("nyc"); No se puede agrega nada a la lista
    }
}
