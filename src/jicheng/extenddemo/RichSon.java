package jicheng.extenddemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/14 23:53
 */
public class RichSon extends RichFather {

    public RichSon(){
        super();//调用父类的构造器
        System.out.println("儿子的默认无参构造器");
    }

    public RichSon(String paoniu){
        this.paoniu=paoniu;
        System.out.println("儿子的有参构造器");
    }



    private String paoniu;

    public void spendMoney(){
        System.out.println("我会花钱");
    }

    public String getPaoniu() {
        return paoniu;
    }

    public void setPaoniu(String paoniu) {
        this.paoniu = paoniu;
    }

    @Override
    public void fancyCar() {
//        super.fancyCar();
        System.out.println("儿子开法拉利");
    }

    @Override
    public String toString() {
        return "RichSon{" +
                "paoniu='" + paoniu + '\'' +
                '}';
    }
}
