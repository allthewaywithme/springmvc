public class Myarray {

    public static void main(String[] args) {

        int [] a={1,4,2,6,8};
        int [] b=change(a);
        for (int bb:b){
            System.out.print(bb);//1926810
        }
      int c=2;
      setNum(c);
      System.out.println(c);//2
    }

    /**
     * 值传递 传递的是值本身，其他方法修改不影响
     * @param a
     */
    public static void setNum(int a){
        a=10;
        System.out.println(a);//10
    }

    /**
     * 引用传递 传递的是对象的引用地址，可以更改对象属性
     * @param a
     * @return
     */
    public static int[] change(int[] a){
        a[1]=9;
        return a;//1926810
    }






}
