public class Test {
    public static void main(String[] args) throws CustomCheckedException {
//        throw  new UncheckedExceptions("Message");
        throw new CustomCheckedException("Bussines exception");
    }
}
