package com.personal.demoProject.teacher;

import com.personal.demoProject.dto.teacher.TeacherRequestDTO;
import com.personal.demoProject.dto.teacher.TeacherResponseDTO;

import java.util.List;

public interface TeacherService {
    TeacherResponseDTO createTeacherAccount (TeacherRequestDTO teacherRequestDTO);
    TeacherResponseDTO getTeacherByTeacherId(Integer teacherId);
    List<TeacherResponseDTO> getAllTeacherName ();
    TeacherResponseDTO updateTeacherAccount (Integer teacherId, TeacherRequestDTO teacherRequestDTO);
    void deleteTeacherAccountByTeacherId(Integer teacherId);
}
