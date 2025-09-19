package com.personal.demoProject.teacher;

import com.personal.demoProject.dto.teacher.TeacherRequestDTO;
import com.personal.demoProject.dto.teacher.TeacherResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Override
    public TeacherResponseDTO createTeacherAccount(TeacherRequestDTO teacherRequestDTO) {return null;}

    @Override
    public TeacherResponseDTO getTeacherByTeacherName(String teacherName) {return null;}

    @Override
    public List<TeacherResponseDTO> getAllTeacherName() {return List.of();}

    @Override
    public TeacherResponseDTO updateTeacherAccount(TeacherRequestDTO teacherRequestDTO) {return null;}

    @Override
    public void deleteTeacherAccountByTeacherName(String teacherName) {

    }
}
