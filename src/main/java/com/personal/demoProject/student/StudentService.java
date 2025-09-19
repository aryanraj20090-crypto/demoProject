package com.personal.demoProject.student;

import com.personal.demoProject.dto.student.StudentRequestDTO;
import com.personal.demoProject.dto.student.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    StudentResponseDTO createStudentAccount(StudentRequestDTO studentRequestDTO);
    StudentResponseDTO getStudentByRollNumber(Integer rollNumber);
    List<StudentResponseDTO> getAllStudent();
    StudentResponseDTO updateStudentAccount(Integer rollNumber, StudentRequestDTO studentRequestDTO);
    void deleteStudentAccountByRollNumber(Integer rollNumber);

}
