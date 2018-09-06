package zhujie;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {

      /*  Class<?> clazz = Class.forName("zhujie.Demo");
        Demo o =(Demo) clazz.newInstance();
        System.out.println(o.getAge());
        String name = clazz.getName();
        Method method = clazz.getDeclaredMethod("add", int.class, int.class);
        Test test = method.getAnnotation(Test.class);
        if (test!=null){
            System.out.println(test.desc());
            System.out.println(test.value());
        }else{
            System.out.println("空了");
        }*/

        Class<Demo> clazz = Demo.class;
//        Method method = clazz.getDeclaredMethod("add", int.class, int.class);
//        Test annotation = method.getAnnotation(Test.class);
//
//        System.out.println(annotation.value());
//        System.out.println(annotation.desc());
        Demo demo = clazz.newInstance();

        System.out.println(demo.getAge());

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(demo,22);
        System.out.println(demo.getAge());



//        Test annotation = add.getAnnotation(Test.class);
//        System.out.println(annotation.value());
//        System.out.println(annotation.desc());



    }
}
