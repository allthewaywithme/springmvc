package mamaobj.zuhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/14 22:29
 */
public class MainClass {

    public static void main(String[] args) {
        Student student=new Student("laowang",20,1);
        Student student2=new Student("laowang2",20,1);
        Student student3=new Student("laowang3",20,1);
        Course course=new Course("语文");
        course.selectCourse(student);
        course.selectCourse(student2);
        course.selectCourse(student3);
        Student[] students = course.getStudents();
        System.out.println(course.getCoruesName()+course.getStudentNumber());


        course.selectCourse(student);
    }
}
