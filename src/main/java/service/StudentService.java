package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private Map<Integer, Student> students = new HashMap<>();

    
    public Student addStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public Map<Integer, Student> getAllStudents() {
        return students;
    }

    public Student updateStudent(int id, Student student) {
        student.setId(id);
        students.put(id, student);
        return student;
    }


    public String deleteStudent(int id) {
        students.remove(id);
        return "Student Deleted Successfully";
    }
}