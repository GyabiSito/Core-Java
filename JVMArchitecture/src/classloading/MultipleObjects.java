package classloading;

public class MultipleObjects {
    public static void main(String[] args) {
        //La clase solo se carga una vez, por mas que instanciemos nuevos usuarios
        User u1=new User();
        Class c1=u1.getClass();

        User u2=new User();
        Class c2=u2.getClass();

        //Aca se verifica
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2); //True

        //Cada clase tiene informacion del classlaoder en memoria
        System.out.println(c1.getClassLoader());
        // jdk.internal.loader.ClassLoaders$AppClassLoader@5a07e868

    }
}
