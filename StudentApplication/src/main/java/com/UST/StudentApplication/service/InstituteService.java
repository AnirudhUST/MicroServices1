package com.UST.StudentApplication.service;

import com.UST.StudentApplication.model.Institute;
import com.UST.StudentApplication.repository.InstituteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituteService {
    @Autowired
    private InstituteRepo repo;
    public Institute addInstitution(Institute institution) {
        return repo.save(institution);
    }


    public List<Institute> getAllInstitutions() {
        return repo.findAll();
    }

    public Institute getInstitutionById(Long id) {
        return repo.getById(id);
    }
}
