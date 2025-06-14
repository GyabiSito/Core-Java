import java.lang.ThreadGroup;

public class CustomThread extends Thread {

    CustomThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
