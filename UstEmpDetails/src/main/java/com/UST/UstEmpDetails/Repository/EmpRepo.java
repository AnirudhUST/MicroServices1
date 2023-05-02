package com.UST.UstEmpDetails.Repository;

import com.UST.UstEmpDetails.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {


    void deleteById(String id);

    Employee findByempId(String id);

    void deleteByEmpId(String empId);

}
