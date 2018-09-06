package zhujie;


import java.lang.annotation.*;


//@Documented//将注解生成文档
@Target(ElementType.METHOD) //将来用作一个类的成员对象上的
@Retention(RetentionPolicy.RUNTIME) //什么时候用
@interface Test {

    public String value();
    public String desc() default "这是一个描述";
}
