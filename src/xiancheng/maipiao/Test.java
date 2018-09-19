package xiancheng.maipiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/19 10:14
 */
public class Test {
    ThreadLocal<Long> l=new ThreadLocal<Long>(){
        protected Long initialValue() {
            return Thread.currentThread().getId();
        };
    };
    ThreadLocal<String> s=new ThreadLocal<String>(){
        protected String initialValue() {
            return Thread.currentThread().getName();
        };
    };


    public long getL() {
        System.out.println(l.get());
        return l.get();
    }

    public void set() {
        l.set(Thread.currentThread().getId());
        s.set(Thread.currentThread().getName());
    }

    public String getS() {
        System.out.println(s.get());
        return s.get();
    }

}
