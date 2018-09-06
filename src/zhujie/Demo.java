package zhujie;

public class Demo {


    private String name;

    private int age=12;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo() {
    }
    @Test(value = "laowang")
    public int add(int a,int b){
        return a+b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
