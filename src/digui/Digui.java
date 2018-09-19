package digui;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/16 10:21
 */
public class Digui {
    public static void main(String[] args) {

//        System.out.println(factorial(10));
        System.out.println(fib(8));
    }

    //递归  自己调用自己  比较危险的算法  很容易堆栈溢出
    //阶乘 4！ 4*3*2*1 0!=1  f(n)=n*(n-1)!;
    public static long factorial(int n){
        if (n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    //斐波那契数列 0 1 1 2 3 5 8 13 21 34 55 89   第三个数等于前两个数之和
    //fib(0)=0; fib(1)=1; fib(x)=fib(x-2)+fib(x-1);
    public static long fib(long index){
        if (index==0){
            return 0;
        }else if(index==1){
            return 1;
        }else{
            return fib(index-1)+fib(index-2);
        }
    }
}
