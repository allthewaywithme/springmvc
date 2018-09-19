package xiancheng.maipiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/19 9:08
 */
public class Demo {
    public static void main(String[] args) {
        SellTicket s=new SellTicket();
        Thread t1=new Thread(s,"线程1");
        Thread t2=new Thread(s,"线程2");
        Thread t3=new Thread(s,"线程3");
        Thread t4=new Thread(s,"线程4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
