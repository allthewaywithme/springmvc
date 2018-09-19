/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/16 10:50
 */
public class Generic {

    //泛型
    private Object object;

    public Object getObject() {
        System.out.println(object.getClass().getName());
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Generic generic=new Generic();
        generic.object=new Integer(22222);
        Integer i = (Integer)generic.getObject();

        Generic generic2=new Generic();
        generic2.object="laowang";
        String s=(String) generic2.getObject();


    }
}
