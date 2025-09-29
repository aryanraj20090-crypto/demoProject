package com.personal.demoProject.student;

import com.personal.demoProject.dto.student.StudentRequestDTO;
import com.personal.demoProject.dto.student.StudentResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentMapper {





    public StudentEntity dtoToEntity(StudentRequestDTO studentRequestDTO ,StudentEntity studentEntity){

        studentEntity.setFirstName(studentRequestDTO.getFirstName());
        studentEntity.setLastName(studentRequestDTO.getLastName());
        studentEntity.setAddress(studentRequestDTO.getAddress());
        studentEntity.setPhoneNo(studentRequestDTO.getPhoneNo());
        studentEntity.setGuardianName(studentRequestDTO.getGuardianName());
        studentEntity.setEmailId(studentRequestDTO.getEmailId());


        return studentEntity;
    }



    public StudentResponseDTO entityToDto(StudentEntity studentEntity){

        StudentResponseDTO studentResponseDTO = new StudentResponseDTO();

        studentResponseDTO.setRollNumber(studentEntity.getRollNumber());
        studentResponseDTO.setFirstName(studentEntity.getFirstName());
        studentResponseDTO.setLastName(studentEntity.getLastName());
        studentResponseDTO.setAddress(studentEntity.getAddress());
        studentResponseDTO.setPhoneNo(studentEntity.getPhoneNo());
        studentResponseDTO.setGuardianName(studentEntity.getGuardianName());
        studentResponseDTO.setEmailId(studentEntity.getEmailId());


        return studentResponseDTO;
    }

    List<StudentResponseDTO> entitiesToDTOS(List<StudentEntity> studentEntities ){
        List<StudentResponseDTO> studentResponseDTOS = new ArrayList<>();
        for (StudentEntity studentEntity : studentEntities){
            StudentResponseDTO studentResponseDTO = entityToDto(studentEntity);
            studentResponseDTOS.add(studentResponseDTO);
        }
        return studentResponseDTOS;
    }
}
