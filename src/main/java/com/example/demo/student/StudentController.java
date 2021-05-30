package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/allStudents")
    public List<Student> getStudentInfo() {
        return studentService.getAllStudents();
    }

    @PostMapping(path = "/addNewStudent")
    public void registerStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
}
