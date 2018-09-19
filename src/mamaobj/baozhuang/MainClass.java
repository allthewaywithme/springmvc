package mamaobj.baozhuang;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/14 22:44
 */
public class MainClass {
    public static void main(String[] args) {

        //基本类型 包装类型 自动拆装箱
        //int double float byte short long char boolean
      /*  Integer a=44;
        Double b=22.22;
        Character c='a';
        int i = Integer.parseInt("123");*/

        String s ="java";
        s="wang";
//        s是指向"java"对象的引用
//        当s="wang";时
//        s变成了指向"wang"对象的引用，此时"java"对象还会存在一会儿，什么时候消失，取决于java垃圾回收

        String s1="welcom";//限定的字符串,如果两个字符串一样，存储的空间只有一份
        String s2="welcom";
        System.out.println(s1.equals(s2));//true比较两个
        System.out.println(s1==s2);//true

        //如果想让他们内容不一样
        String s3=new String("welcom");//强制开辟内存新建一个对象
        System.out.println(s1==s3);//false
        String s4=new String("welcom");
        System.out.println(s3==s4);//false


        boolean result="java to learn".matches("java to learn");
        System.out.println(result);//true
        boolean result1="java to learn".matches("java.*");
        System.out.println(result1);//true

        StringBuffer stringBuffer=new StringBuffer("wang");
        StringBuilder stringBuilder=new StringBuilder("yang");

        stringBuffer.append("ddd").append(111);
        stringBuilder.append("dda").append(55);
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuilder.toString());
        //StringBuilder 线程不安全  多个线程同时操作一个StringBuilder 会造成数据混乱  效率快
        //stringBuffer  线程安全    多个线程同时操作一个StringBuilder 不会造成数据混乱  效率低会排队







    }
}
