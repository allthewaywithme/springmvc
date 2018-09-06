package dao;

import entity.Student;

import java.util.List;

public interface StudentMapper {

    public int insertStudent(Student student)throws Exception;

    Student selectById(int id)throws Exception;

    List<Student> selectList();
}
