package mamaobj.zuhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/14 22:24
 */
public class Course {

    {
        students=new Student[50];
    }

    private Student[] students;

    private int studentNumber;

    private String coruesName;

    Course(String coruesName){
        this.coruesName=coruesName;
    }

    public String getCoruesName() {
        return coruesName;
    }

    public void setCoruesName(String coruesName) {
        this.coruesName = coruesName;
    }

    public  void selectCourse(Student student){
        students[studentNumber]=student;
        studentNumber++;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }

    public void dropStudent(Student student){
        //遍历学生列表 从数组中删除名字一样的
    }

}
