public class GCDemo {

    int objid;

    GCDemo(int objid)
    {
        this.objid = objid;
//        System.out.println(this + "created");
        System.out.println("created: " + this.objid);
    }
    public static void main(String[] args) {
        new GCDemo(1);
        new GCDemo(2);
        System.gc();
//        for (int i=0; i<100000000; i++){
//            new GCDemo(i);
//        }
//        new GCDemo();
//        new GCDemo();
//
//        System.gc(); // Sugerencia al GC
    }

    @Override
    protected void finalize() {
        System.out.println("finalized " + objid);
    }
}
