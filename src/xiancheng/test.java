package xiancheng;

import java.util.Date;

public class test {

    public static void main(String[] args) {

        Count count=new Count();
        System.out.println(new Date());
        new Thread(new Runnable() {
            @Override
            public void run() {
                count.add();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                count.add();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                count.add();
            }
        }).start();
        System.out.println(new Date());
    }
}
