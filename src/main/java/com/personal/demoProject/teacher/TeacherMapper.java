package com.personal.demoProject.teacher;

import com.personal.demoProject.dto.teacher.TeacherRequestDTO;
import com.personal.demoProject.dto.teacher.TeacherResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherMapper {



    public TeacherEntity dtoToEntity (TeacherRequestDTO teacherRequestDTO, TeacherEntity teacherEntity){
        teacherEntity.setTeacherId(teacherRequestDTO.getTeacherId());
        teacherEntity.setTeacherName(teacherRequestDTO.getTeacherName());
        teacherEntity.setEmailId(teacherRequestDTO.getEmailId());
        teacherEntity.setPhoneNo(teacherEntity.getPhoneNo());
        teacherEntity.setHiringDate(teacherRequestDTO.getHiringDate());
        teacherEntity.setDepartmentId(teacherEntity.getDepartmentId());

        return teacherEntity;
    }
    public TeacherResponseDTO entityToDto (TeacherEntity teacherEntity){
        TeacherResponseDTO teacherResponseDTO = new TeacherResponseDTO();
        teacherResponseDTO.setTeacherId(teacherEntity.getTeacherId());
        teacherResponseDTO.setTeacherName(teacherEntity.getTeacherName());
        teacherResponseDTO.setEmailId(teacherEntity.getEmailId());
        teacherResponseDTO.setPhoneNo(teacherEntity.getPhoneNo());
        teacherResponseDTO.setHiringDate(teacherEntity.getHiringDate());
        teacherResponseDTO.setDepartmentId(teacherEntity.getDepartmentId());

        return teacherResponseDTO;
    }
    List<TeacherResponseDTO> entitiesToDTOS(List<TeacherEntity> teacherEntities){
        List<TeacherResponseDTO> teacherResponseDTOS = new ArrayList<>();
        for (TeacherEntity teacherEntity : teacherEntities){
            TeacherResponseDTO teacherResponseDTO = entityToDto(teacherEntity);
            teacherResponseDTOS.add(teacherResponseDTO);
        }
        return teacherResponseDTOS;
    }

}
