package jicheng.duotai;



/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/15 0:47
 */
public class DynamicBinding {
    public static void main(String[] args) {
        m(new Object());
        m(new Student());
        m(new Person1());

        //继承链 中 A 继承B B继承C   A 是最特殊的一个  C是所有的基础 A B 的
        //动态绑定 JVM 在运行的时候才去找子类中的一个实现去运行  具体调用的是继承链中最近的一个
        //传的是哪一个对象 运行的就是哪一个
        //protected 只有类的本身和子类可以使用，同包里可以使用
        //主要是子类想要使用父类的，不想要别人用

    }

    public static  void m(Object obj){
        System.out.println(obj.toString());
    }
}

class Student extends Person1 {
    @Override
    public String toString() {
        return "Student{}";
    }
}

class Person1 extends Object{

}
