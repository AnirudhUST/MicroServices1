package com.UST.EmpDeptFac.repo;

import com.UST.EmpDeptFac.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Facrepo extends JpaRepository<Faculty,Integer> {
}
