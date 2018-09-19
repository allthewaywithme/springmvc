/**
 * Created with IntelliJ IDEA.
 * Description:泛型讲解
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/16 10:55
 */
public class Genericf<T> {

    private T genericf;

    public T getGenericf() {
        System.out.println(genericf.getClass().getName());
        return genericf;
    }

    public void setGenericf(T genericf) {
        this.genericf = genericf;
    }

    //泛型方法
    public static <E> void sss(E e){
        System.out.println(e);
    }

    //泛型方法 限定类型
    public static <R extends Number> void rr(R e){
        System.out.println(e);
    }

    //参数的通配符 只要是Number的子类都可以   super只要是Number的父类都可以
    public static void ff(Genericf<? extends Number> f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        Genericf<Integer> g=new Genericf();
        g.genericf=new Integer(5656);
        g.getGenericf();
        Genericf<String> s=new Genericf();
        s.genericf=new String("laowang");
        s.getGenericf();

        sss(new Integer(5656));
        rr(new Integer("525"));
        ff(g);
    }
}
