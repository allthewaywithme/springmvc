package entity;

public class Student {

    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Integer tId;

    public Student(Integer id, String name, String sex, Integer age, Integer tId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tId = tId;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
}
