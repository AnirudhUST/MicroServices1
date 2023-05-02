package com.UST.departmentservice.repository;

import com.UST.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

//    Department findDepartmentById(Long departmentId);

    Department findByDepartmentId(Long departmentId);
}
