package com.example.technicalassessment.controller;

import com.example.technicalassessment.model.Student;
import com.example.technicalassessment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public void addNewStudent(@RequestBody Student student) {
         studentService.addNewStudent(student);
    }


    @PutMapping("/students/{name}")
    public Student updateStudent(@PathVariable String name, @RequestBody Student student){
        return studentService.updateStudent(name, student);
    }

    @GetMapping("students/{name}")
    public Student findStudentByName(@PathVariable String name){

        return studentService.findStudentByName(name);
    }
    @DeleteMapping("students/{name}")
    public void deleteStudent(@PathVariable String name){
      studentService.deleteStudent(name);
    }
}
