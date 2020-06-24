package com.example.technicalassessment.service;

import com.example.technicalassessment.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    int index = 1;
    List<Student> listOfStudents = new ArrayList(Arrays.asList(
            new Student(index++, "Chiamaka Okenwa", 22, "Year 2", "Female"),
            new Student(index++, "Kola Akoni", 25, "Year 5", "Male"),
            new Student(index++, "Michael John", 23, "Year 3", "Male")
    ));

    public List<Student> getAllStudents(){
        return listOfStudents;
    }

    public void addNewStudent(Student student){
        student.setId(index++);
       listOfStudents.add(student);
    }



    public Student updateStudent(String name, Student student){
        Student existingStudent = findStudentByName(name);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setClassYear(student.getClassYear());
        existingStudent.setGender(student.getGender());
        return existingStudent;
    }

    public Student findStudentByName(String name){
        for(Student student : listOfStudents){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String name){
        Student existingStudent = findStudentByName(name);
        listOfStudents.remove(existingStudent);
    }



}
