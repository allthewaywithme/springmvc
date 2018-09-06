import zhujie.Demo;

import java.lang.reflect.Field;

public class Fanshe {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        Class<?> clazz = Class.forName("Demo1");
        Demo1 o =(Demo1)clazz.newInstance();
        Field field =clazz.getDeclaredField("name");
        System.out.println(field.getName());
        field.setAccessible(true);
        field.set(o,"laowang");
        System.out.println(o.getName());


        int add = o.add(1, 2);
        System.out.println(add);




    }
}
