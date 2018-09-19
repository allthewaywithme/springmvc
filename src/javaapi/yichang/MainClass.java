package javaapi.yichang;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/15 13:12
 */
public class MainClass {
    public static void main(String[] args) {
        //异常处理  运行时异常
//        int[] a=new int[5];
//        a[5]=10;

        /*try{//捕获异常
            Object o=new Object();
            if (o instanceof Integer){

                Integer i=(Integer)o;
            }

        }catch (ClassCastException e){
            System.out.println("类型转换挂了");
            e.printStackTrace();
        }*/

        Object o=new Object();
        if (o instanceof Integer){

            Integer i=(Integer)o;
        }else{//抛出异常
            throw new ClassCastException();
        }



    }
}
