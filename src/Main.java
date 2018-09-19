
import dao.StudentMapper;
import entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

//        Environment builder = new Environment.Builder("").transactionFactory("").dataSource("");
//        1.使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
//        InputStream in = Main.class.getResourceAsStream("resource/mybatis-config.xml");
        //构建器模式
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        //2.使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("resource/mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);


        SqlSession session = sessionFactory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        Student student=new Student(6,"小丽","女",20,5);
//        int i = mapper.insertStudent(student);
        Student student=new Student();
        Student student1 = mapper.selectById(1);
        System.out.println(student1);
        List<Student> students = mapper.selectList();
        for (Student s:students){
            System.out.println(s.getName()+"-"+s.getSex()+"-"+s.getAge());
        }
        session.commit();
        session.close();
    }
}
