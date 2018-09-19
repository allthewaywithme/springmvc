import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/16 11:08
 */
public class Collections {

    //数据结构和算法是计算机的基础
    //集合类 是一种工具类 提供了一些便捷的操作数据的方法 数据结构的包装类
    // 数组 长度固定了，不灵活 删除插入非常麻烦 不能扩容
   // int[] a=new int[5];

    //list 可以重复可以null 查找效率非常高  插入删除 非常麻烦 效率低
    public static void main(String[] args) {
        /*ArrayList<String> list=new ArrayList();
        list.add("dd");
        list.add("dd");
        list.add("dd");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));*/

        //链表  指针域像链条一样指向下一个元素  查找效率非常低  插入删除效率非常高 扩容没有问题
        LinkedList list=new LinkedList();

        //list 单列集合  map双列集合  queue队列 先进先出   栈先进后出
        //list  允许重复    有序    主要有ArrayList和LinkedList
        //set   不允许重复  无序    主要有HashSet和TreeSet   set根据hashcode和 equals方法判断是否重复,
        //set存储不重复对象时需要重写hashcode和equals方法 先判断hashcode再判断equals
        //queue
//        HashSet<User> set=new HashSet<>();//无序不重复
//        set.add("laowang");
//        set.add("laowang2");
//        set.add("laowang3");
//        set.add("laowang3");//重复元素添加不成功
//              set.add(new User("laowang",25));
//        set.add(new User("laowang",25));
//        set.add(new User("laowang",235));
//        for (User s:set){
//            System.out.println(s.toString());
//        }

//        TreeSet<String> set=new TreeSet<>();//有序的 a打头的在前面 通过字典来排序   不重复  compare比较器来去重的
//        set.add("laowang");
//        set.add("laowang2");
//        set.add("laowang3");
//        set.add("laowang3");
//        for (String s:set){
//            System.out.println(s);
//        }
        TreeSet<User> set=new TreeSet<>();
        set.add(new User("laowang",25));
        set.add(new User("laowang",25));
        set.add(new User("laowang",235));
        for (User s:set){
            System.out.println(s);
        }





    }






}
