import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/16 11:51
 */
public class User implements Comparable{

    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        User user=(User)o;
        if (this.age>user.age){
            return 1;
        }else if (this.age<user.age){
            return -1;
        }else {
            return 0;
        }
    }
}
