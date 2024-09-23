package org.itstep.controller;

import org.itstep.model.Student;
import org.itstep.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/", consumes = "application/json", produces = "application/json")
public class MainController{
  @Autowired
  StudentMapper studentMapper;
  @GetMapping("/findAllStudents")
  public List<Student> findAllStudents(){
    return studentMapper.findAllStudents();
  }
  @PostMapping("/insertStudent")
  public void insertStudent(@RequestBody Student student){
    studentMapper.insertStudent(student);
  }
  @PutMapping("/updateStudent/{id}")
  public void updateStudent(@RequestBody Student student,@PathVariable("id") int id){
    studentMapper.updateStudent(student,id);
  }
  @DeleteMapping("/deleteStudent/{id}")
  public void deleteStudent(@PathVariable("id") int id){
    studentMapper.deleteStudent(id);
  }
}