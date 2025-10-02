package com.personal.demoProject.student;

import com.personal.demoProject.dto.student.StudentRequestDTO;
import com.personal.demoProject.dto.student.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    StudentResponseDTO createStudentAccount(StudentRequestDTO studentRequestDTO);
    StudentResponseDTO getStudentByStudentId(Integer studentId);
    List<StudentResponseDTO> getAllStudent();
    StudentResponseDTO updateStudentAccount(Integer studentId, StudentRequestDTO studentRequestDTO);
    void deleteStudentAccountByStudentId(Integer studentId);

}
