import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    String name;

    public Test() {
        System.out.println("Test");
    }

    public Test(double x, double y) {
        System.out.println("Test2");
    }


    @MyAnnotation(value="123")
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> myClass = Class.forName(Test.class.getName());
        System.out.println(myClass);
        Constructor<?>[] constructors = myClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
        System.out.println(Arrays.toString(myClass.getMethods()));

        Constructor<?> cons = myClass.getConstructor(null);

        System.out.println(cons.newInstance(null));

        Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
        Object myObj = constructor2.newInstance(1.0, 2.0);

        Method method = myClass.getMethod("method1", null);
        System.out.println(method.invoke(myObj, null));

        Method setnombre = myClass.getMethod("setName", String.class);
        setnombre.invoke(myObj, "pepe");

        Field nameField=myClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(myObj, "pepardobich");
        System.out.println(nameField.get(myObj));

        System.out.println(myClass.getAnnotations());

        Annotation[] annotations=myClass.getAnnotations();
        


    }

    public void setName(String name) {
        this.name = name;
    }

    public void method1() {
        System.out.println("method1");
    }

}
