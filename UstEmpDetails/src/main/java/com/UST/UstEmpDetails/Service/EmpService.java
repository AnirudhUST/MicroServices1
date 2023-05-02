package com.UST.UstEmpDetails.Service;

import com.UST.UstEmpDetails.Model.Employee;
import com.UST.UstEmpDetails.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Scanner;

@Service
public class EmpService {

    Scanner sc = new Scanner(System.in);
    @Autowired
    private EmpRepo repo;

    public Employee createEmployee(Employee employee) {



        return repo.save(employee);
        
    }

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getByEmployeeId(String empId) {
        return repo.findByempId(empId);
    }
@Transactional
    public String deleteEmployeeById(String empId) {

         repo.deleteByEmpId(empId);
        return "the employee information is deleted" ;
    }
}
