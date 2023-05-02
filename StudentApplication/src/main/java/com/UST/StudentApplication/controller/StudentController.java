package com.UST.StudentApplication.controller;

import com.UST.StudentApplication.model.Student;
import com.UST.StudentApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/STUDENT")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/ADD")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
    @GetMapping("/GET/{course}")
    public Long getCount(@PathVariable String course){
        return studentService.getCount(course);
    }
    @GetMapping("getaddress/{add}")
    public List<Student> getList(@PathVariable String add) {
        return studentService.getAdd(add);
    }

}
