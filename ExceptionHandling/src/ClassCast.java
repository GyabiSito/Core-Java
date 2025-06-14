public class ClassCast {
    public static void main(String[] args) {
        Object o = new Object();
        //String st = (String) o; => ClassCastException

        if(o instanceof String){
            String s = (String) o;
        }

    }
}
