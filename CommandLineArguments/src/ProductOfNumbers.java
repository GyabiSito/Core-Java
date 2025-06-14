public class ProductOfNumbers {
    public static void main(String[] args) {
        int product=1;
        for(int i=1; i<=args.length; i++){
            product*=Integer.parseInt(args[i-1]);
        }
        System.out.println(product);
    }
}
