import java.lang.NumberFormatException;

public class MultiCatch {
    public static void main(String[] args) {
        try{

        String input=args[0];
        System.out.println("Input " + input);
        int output=Integer.parseInt(args[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("input is required");
        }catch (NumberFormatException e){
            System.out.println("input is not a number");
        }
        System.out.println("more code");
    }
}
