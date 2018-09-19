package chouxiang.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/15 12:26
 */
public abstract class DogClass {

    public void legs(){//腿
        System.out.println("狼和狗都有四条腿");
    }

    public void tails(){
        System.out.println("狼和狗都有尾巴");
    }

    //狼行千里吃肉 狗行千里吃骨头
    public abstract void eat();
}
