package xiancheng.maipiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/19 9:06
 */
public class SellTicket implements Runnable {

    private int num=100;

    @Override
//    public synchronized void run() {//synchronized加在方法上只会有一个线程，这个线程会卖完所有的票
    public  void run() {
        /*try {
            while (num>0){
                Thread.sleep(100);
                num--;
                System.out.println(Thread.currentThread().getName() + "还剩" + num + "张！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            while (true){
                synchronized (this){//this指向当前类的对象
                    if (num>0){
                        Thread.sleep(100);
                        num--;
                        System.out.println(Thread.currentThread().getName() + "还剩" + num + "张！");
                    }else {
                        System.out.println(Thread.currentThread().getName()+"票卖完了");
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
