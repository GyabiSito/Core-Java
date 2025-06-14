import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmeticException {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();
        try{
            c = a/b;
            System.out.println("Result " + c);
        }catch(java.lang.ArithmeticException e){
            System.out.println("El valor no es divisible");
        }finally {
            sc.close();
            System.out.println("Pase lo que pase, franco es un trolazo");
        }
//        //Arithmetic Exception


    }

}
