package com.UST.StudentApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String sid;
    private String name;
    private String email;
    private String phone;
    private String qualification;
    @ElementCollection
    private List<String> interestedCourse;
    private String address;
    private String comment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Cid")
    private Institute institute;
}
