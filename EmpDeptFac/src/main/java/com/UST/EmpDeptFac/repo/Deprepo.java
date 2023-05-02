package com.UST.EmpDeptFac.repo;

import com.UST.EmpDeptFac.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Deprepo extends JpaRepository<Department,Integer> {
}
