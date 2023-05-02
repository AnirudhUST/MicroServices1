package com.UST.UstEmpDetails.Controller;

import com.UST.UstEmpDetails.Model.Employee;
import com.UST.UstEmpDetails.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService employeeService;
    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee) {


        return employeeService.createEmployee(employee);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping ("/employees/{empId}")
    public Employee getAllEmployees(@PathVariable String empId){
        return employeeService.getByEmployeeId(empId);
    }



    @DeleteMapping("/deleteemployee/{empId}")
    public String deleteEmployee(@PathVariable String empId) {
        return employeeService.deleteEmployeeById(empId);
    }
}
