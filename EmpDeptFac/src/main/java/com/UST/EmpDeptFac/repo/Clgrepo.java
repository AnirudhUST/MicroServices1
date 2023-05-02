package com.UST.EmpDeptFac.repo;

import com.UST.EmpDeptFac.Model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clgrepo extends JpaRepository<College,Integer> {
}
