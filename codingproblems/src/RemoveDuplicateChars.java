import java.util.ArrayList;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String s = "aaaaaaabbbbbbcccccddddeeeefffffffffffffffff";
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char eachChar= s.charAt(i);
            if(!arr.contains(eachChar)){
                arr.add(eachChar);
            }
        }
        System.out.println(arr);
        arr.stream().forEach(System.out::print);
    }
}
