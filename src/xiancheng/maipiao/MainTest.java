package xiancheng.maipiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/19 10:19
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        final Test test = new Test();

        System.out.println(test.getL()+"--");
        System.out.println(test.getS()+"--");

        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getL()+"==");
                System.out.println(test.getS()+"==");
            };
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getL()+"XX");
        System.out.println(test.getS()+"XX");



    }
}
