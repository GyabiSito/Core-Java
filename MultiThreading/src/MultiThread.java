public class MultiThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MultiThread mt = new MultiThread();
        mt.setPriority(Thread.MAX_PRIORITY);
        mt.setName("mt0");
        mt.start();  //Agarro el .start porque asi pregunto si no hay hilos ejecutandose, y luego llama a run internamente

        MultiThread mt1 = new MultiThread();
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt.setName("mt1");
        mt1.start();  //Agarro el .start porque asi pregunto si no hay hilos ejecutandose, y luego llama a run internamente


//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread.getName());
//        for (int j = 0; j < 200; j++) {
//            System.out.print("j: " + j + "\t");
//            Thread.sleep(1000);
//        }
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
//        currentThread.setName("Print 200 numbers");
        System.out.println(currentThread.getName());
//        for (int i = 0; i < 200; i++) {
//            System.out.print("i: " + i + "\t");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
