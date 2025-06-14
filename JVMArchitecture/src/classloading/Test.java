package classloading;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //Para cargar una clase dinamicamente usamos el Class.forname (de java.lang)
        //Agarra la lcase User y la carga a memoria
        //Primero carga la clase a memoria al method area, entonces crea un objeto de tipo Class que lo represente en memoria
        Class c = Class.forName("classloading.User");
        Method[] methods = c.getDeclaredMethods();
        for(Method method: methods){
            System.out.println(method.getName());
        }

        System.out.println(methods.length);
        System.out.println(String.class.getClassLoader()); // NULL
        //Da null porque clases como String son cargadas por el bootstrap que se encuetnrarn en la carpeta LIB de JRE
    }
}
