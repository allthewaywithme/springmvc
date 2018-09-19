package jicheng.extenddemo;

/**
 * Created with IntelliJ IDEA.
 * Description:rich 富有的
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/14 23:51
 */
public class RichFather extends GrandPar {

    private String money;

    public RichFather() {
        this("225252");
        System.out.println("j老爹的无参构造器");
    }

    public void bigHouse(){

        System.out.println("老爹住别墅，很有钱");
    }

    public void fancyCar(){

        System.out.println("老爹开商务车，很有钱");
    }

    public RichFather(String money) {
        System.out.println("老爹的有参构造器");
        this.money = money;
    }

    public String getMoney() {

        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
