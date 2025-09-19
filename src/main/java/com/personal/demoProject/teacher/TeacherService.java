package com.personal.demoProject.teacher;

import com.personal.demoProject.dto.teacher.TeacherRequestDTO;
import com.personal.demoProject.dto.teacher.TeacherResponseDTO;

import java.util.List;

public interface TeacherService {
    TeacherResponseDTO createTeacherAccount (TeacherRequestDTO teacherRequestDTO);
    TeacherResponseDTO getTeacherByTeacherName (String teacherName);
    List<TeacherResponseDTO> getAllTeacherName ();
    TeacherResponseDTO updateTeacherAccount (TeacherRequestDTO teacherRequestDTO);
    void deleteTeacherAccountByTeacherName (String teacherName);
}
