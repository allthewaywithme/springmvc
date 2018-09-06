package xiancheng;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {

    private AtomicInteger count=new AtomicInteger();//jdk提供的原子类  具有原子性

    public  void add(){
        for(int i=0;i<200;i++){
            try {
                Thread.sleep(100);
                System.out.println(count.incrementAndGet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        /*
        //synchronized 内部锁  可重入锁
        for(int i=0;i<200;i++){
            try {
                Thread.sleep(100);
                synchronized(this){
                    this.count++;//竞争条件
                    System.out.println(this.count);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/
    }

}
