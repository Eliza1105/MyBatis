package org.itstep.repository;

import org.apache.ibatis.annotations.*;
import org.itstep.model.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
@Select("select * from Students")
List<Student> findAllStudents();
@Select("select * from Students where studId=#{id}")
Student findStudentById(Integer id);
@Insert("insert into Students(name,email) values(name=#{name},email=#{email})")
void insertStudent(Student student);
@Update("update Students set name=#{student.name},email=#{student.email} where studId=#{id}")
void updateStudent(Student student,int id);
@Delete("delete from Students where studId=#{id}")
void deleteStudent(Integer id);
}