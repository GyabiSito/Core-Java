public class StaticBlockInit {
    static{
        int i=20/0; // ExceptionInInitializerError
    }
    public static void main(String args[]){

    }
}
