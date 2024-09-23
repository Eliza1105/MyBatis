package org.itstep.controller;

import org.itstep.model.Students;
import org.itstep.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/", consumes = "application/json", produces = "application/json")
public class MainController{
  @Autowired(required=true)
  StudentMapper studentMapper;
  @GetMapping("/findAllStudents")
  public List<Students> findAllStudents(){
    return studentMapper.findAllStudents();
  }
  @PostMapping("/insertStudent")
  public void insertStudent(@RequestBody Students students){
    studentMapper.insertStudent(students);
  }
  @PutMapping("/updateStudent/{id}")
  public void updateStudent(@RequestBody Students students,@PathVariable("id") int id){
    studentMapper.updateStudent(students,id);
  }
  @DeleteMapping("/deleteStudent/{id}")
  public void deleteStudent(@PathVariable("id") int id){
    studentMapper.deleteStudent(id);
  }
}