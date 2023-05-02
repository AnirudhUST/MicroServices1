package com.UST.StudentApplication.controller;

import com.UST.StudentApplication.model.Institute;
import com.UST.StudentApplication.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/institution")
public class InstituteController {
    @Autowired
    private InstituteService institutionService;

    @PostMapping
    public Institute addInstitution(@RequestBody Institute institution) {
        return institutionService.addInstitution(institution);
    }

    @GetMapping
    public List<Institute> getAllInstitutions() {
        return institutionService.getAllInstitutions();
    }

    @GetMapping("/{id}")
    public Institute getInstitutionById(@PathVariable Long id) {
        return institutionService.getInstitutionById(id);
    }
}
