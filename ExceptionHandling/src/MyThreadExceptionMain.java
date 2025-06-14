public class MyThreadExceptionMain {
    public static void main(String[] args) throws InterruptedException {
        try{
            Thread.sleep(2000);
            throw new MyThreadException("e");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
