package com.UST.StudentApplication.service;

import com.UST.StudentApplication.model.Student;
import com.UST.StudentApplication.model.Student$;
import com.UST.StudentApplication.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.UST.StudentApplication.model.Student$.interestedCourse;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private JPAStreamer jpaStreamer;

    public  Student addStudent(Student student) {
        return studentRepo.save(student);
    }


    public Long getCount(String course) {

        return jpaStreamer.stream(Student.class)
                .flatMap(student -> student.getInterestedCourse().stream())
                .filter(course::contains)
                .distinct()
                .count();
    }

    public List<Student> getAdd(String add) {
        return jpaStreamer.stream(Student.class)
                .filter(Student$.address.equal(add))
                .collect(Collectors.toList());
    }
}
