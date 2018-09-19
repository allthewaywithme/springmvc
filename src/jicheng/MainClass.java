package jicheng;

import jicheng.extenddemo.RichFather;
import jicheng.extenddemo.RichSon;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/14 23:56
 */
public class MainClass {
    public static void main(String[] args) {
        //继承是为了减少重复代码
      //  RichFather father=new RichFather("2222222222");
//        RichSon richSon=new RichSon();
//        richSon.setPaoniu("网红");
//        richSon.spendMoney();
//        richSon.bigHouse();
//        richSon.fancyCar();
//        richSon.getMoney();

//        RichSon richSon=new RichSon("网红");
        //Object是所有类的父类，任何一个类都是继承Object的，所有的类都是Object类
        Object o=new Object();
        String s = o.toString();
        System.out.println(s);

        //多态  父类的变量 指向子类的引用
        Object o1=new RichSon("网红");
        System.out.println(o1.toString());//RichSon{paoniu='网红'}



    }
}
