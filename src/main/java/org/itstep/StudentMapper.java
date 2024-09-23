package org.itstep;

import org.apache.ibatis.annotations.*;
import org.itstep.model.Students;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from Students")
    List<Students> findAllStudents();
    @Select("select * from Students where studId=#{id}")
    Students findStudentById(Integer id);
    @Insert("insert into Students(name,email) values(name=#{name},email=#{email})")
    void insertStudent(Students student);
    @Update("update Students set name=#{student.name},email=#{student.email} where studId=#{id}")
    void updateStudent(Students student, int id);
    @Delete("delete from Students where studId=#{id}")
    void deleteStudent(Integer id);
}