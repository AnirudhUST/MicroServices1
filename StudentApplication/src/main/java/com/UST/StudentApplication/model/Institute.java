package com.UST.StudentApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "institue")
public class Institute {
    @Id

    private Long Cid;
    private String name;
    private String location;
    @ElementCollection
    private HashMap<Long,String> courses;
    @OneToMany(mappedBy = "institute",cascade = CascadeType.ALL)
    private List<Student> student;
}
