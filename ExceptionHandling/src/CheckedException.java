import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        CheckedException ce=new CheckedException();
        try{
            ce.readFile();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public static void readFile() throws FileNotFoundException {
        try{
            FileInputStream fis=new FileInputStream("");
        }catch(Exception e){
            System.out.println("Error reading file");
        }
    }

}
