package com.example.student.service;

import com.example.student.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public List<Student> search(String address);
}
