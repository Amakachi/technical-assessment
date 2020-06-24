package com.example.technicalassessment.model;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String classYear;
    private String gender;

    public Student(Integer id, String name, Integer age, String classYear, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classYear = classYear;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
