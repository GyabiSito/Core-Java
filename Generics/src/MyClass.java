public class MyClass extends Thread implements Comparable<String>{
    @Override
    public int compareTo(String o){
        return o.compareTo(this.toString());
    }
}
