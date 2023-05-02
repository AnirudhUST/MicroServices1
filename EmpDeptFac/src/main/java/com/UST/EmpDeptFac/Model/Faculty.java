package com.UST.EmpDeptFac.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
    @Id
    @GeneratedValue
    private int fid;
    private String fname;
    private Department department;
    private College college;
}
