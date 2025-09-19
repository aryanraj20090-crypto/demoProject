package com.personal.demoProject.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository <StudentEntity ,Integer > {

     Optional<StudentEntity> findByRollNumber(Integer rollNumber);

}
