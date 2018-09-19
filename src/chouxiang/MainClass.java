package chouxiang;

import chouxiang.demo.Dog;
import chouxiang.demo.DogClass;
import chouxiang.demo.Wolf;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/15 12:24
 */
public class MainClass {
    public static void main(String[] args) {
        //抽象类  接口
        //类里有抽象方法，类一定是抽象类。类是抽象类，方法里可以没有抽象方法
        //接口只有方法声明，完全没有方法实现
//
//        DogClass dog = new Dog();
//        dog.eat();
//        dog.legs();
//        dog.tails();
//
//        DogClass wolf=new Wolf();
//        wolf.eat();
//        wolf.tails();
//        wolf.tails();

        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        Date date=new Date();
        Date date2=new Date();
        int i = date.compareTo(date2);
        System.out.println(i);



    }
}
