package com.personal.demoProject.departments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepo extends JpaRepository <DepartmentsEntity, Integer> {
    Optional<DepartmentsEntity> findById (Integer deptId);
}
