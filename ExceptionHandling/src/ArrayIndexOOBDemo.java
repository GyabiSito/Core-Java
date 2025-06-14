public class ArrayIndexOOBDemo {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        try{

        System.out.println("Los elementos son;");
        for (int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
            //Cuando llegue a i=4, va a dar un out of bound exception
        //Explota
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El elemento no existe");
        }
        System.out.println("Despues de la salida");
    }

    void method1(){
        System.out.println("Method1");
    }
}
