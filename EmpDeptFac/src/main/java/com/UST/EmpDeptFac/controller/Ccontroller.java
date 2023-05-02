package com.UST.EmpDeptFac.controller;

import com.UST.EmpDeptFac.Model.College;
import com.UST.EmpDeptFac.service.Cservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class Ccontroller {
    @Autowired
    private Cservice cservice;

    @PostMapping("/addemp")
    public College addEmployee(@RequestBody College college) {
        return cservice.createCollege(college);
    }
    @GetMapping
    public List<College> getAllColleges() {
        return cservice.getAllColleges();
    }

    @GetMapping("/{collegeId}")
    public College getCollegeById(@PathVariable Long collegeId) {
        return cservice.getCollegeById(collegeId);
    }

    @GetMapping("/search")
    public College getCollegeByName(@RequestParam String name) {
        return cservice.getCollegeByName(name);
    }

    @PutMapping("/{collegeId}")
    public College updateCollegeName(@PathVariable Long collegeId, @RequestParam String name) {
        return cservice.updateCollegeName(collegeId, name);
    }

    @DeleteMapping("/{collegeId}")
    public void deleteCollege(@PathVariable Long collegeId) {
        cservice.deleteCollege(collegeId);
    }
}
