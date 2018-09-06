public class Paixu {

    public static void main(String[] args) {

        int a[]={6,9,4,5};
//        int px = px(a);
//        System.out.println(px);
        int[]s =selectSort(a);
        for (int d:s){
            System.out.print(d);
        }
        System.out.println("------");

        int[] maopao = bubboSort();
        for (int m:maopao){
            System.out.print(m);
        }

    }




    //选择排序

    /**
     * 首先外层数组length为4 外层判断四次 每次把最小的数放在左边，依次放
     * 其次内层根据a[0]=a[i]=6 a[j]=a[1]=9 a[j]=a[2]=4 a[j]=a[3]=5  判断出 a[j]=a[2]=4最小放在最左边下次不计入判断
     * 然后a[i]=a[1]=9 a[j]=a[2]=6 a[j]=a[3]=5 同上操作 判断出最小的为a[j]=a[3]=5  最小放在最左边下次不计入判断
     * 最后同理
     * @param a
     * @return
     */
    public static int[] selectSort(int []a){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    return a;
    }

    //冒泡排序

    /**
     * 首先 数组长度为4 外层相邻两个数据判断 共判断三次  外层循环长度为  length-1
     * 其次 内层判断应该是从第二个数算起 外层第一个数依次和内层剩下的每一个数判断 a[0]=6  j[1]=9  j[2]=4  j[3]=5
     * 然后 a[1]的时候a[0]是数组里最小的数 从a[1]开始和j[2]到j[3]判断找出最小的数成为a[1]
     * @return
     */
    public static int[] maopao(){
        int a[]={6,9,4,5};
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }


    //冒泡排序 最大的从最后面开始冒泡
    public static int[] bubboSort(){
        int a[]={6,9,4,8,5};
        for (int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }






    //查找一个数组中最大的值
    public static int px(int [] a){

        int result=0;
        for (int b:a){
            if (b>result){
                result=b;
            }
        }
        return result;
    }
}
