public class SingleThread {
    public static void main(String[] args) {

        SingleThread singleThread = new SingleThread();
        singleThread.printNumbers();

        for (int j = 0; j < 200; j++) {

            System.out.print("j: " + j + "\t");
        }
    }
    void printNumbers(){
        for (int i = 0; i < 200; i++) {
            System.out.print("i: " + i + "\t");
        }
    }
}
