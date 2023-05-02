package com.UST.EmpDeptFac.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class College {

    @Id
    @GeneratedValue
    private int cid;
    private String cname;
    private Department department;
    private Faculty faculty;
}
