package com.personal.demoProject.classes;

import com.personal.demoProject.dto.classes.ClassesRequestDTO;
import com.personal.demoProject.dto.classes.ClassesResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassesMapper {


    public ClassesEntity dtoToEntity(ClassesRequestDTO classesRequestDTO, ClassesEntity classesEntity){

        classesEntity.setClassId(classesRequestDTO.getClassId());
        classesEntity.setClassName(classesRequestDTO.getClassName());
        classesEntity.setSection(classesRequestDTO.getSection());

        return classesEntity;
    }

    public ClassesResponseDTO entityToDto(ClassesEntity classesEntity){

        ClassesResponseDTO classesResponseDTO = new ClassesResponseDTO();
        classesResponseDTO.setClassId(classesEntity.getClassId());
        classesResponseDTO.setClassName(classesEntity.getClassName());
        classesResponseDTO.setSection(classesEntity.getSection());

        return classesResponseDTO;
    }
    List<ClassesResponseDTO> entitiesToDTOS (List<ClassesEntity> classesEntities){
        List<ClassesResponseDTO> classesResponseDTOS = new ArrayList<>();
        for(ClassesEntity classesEntity : classesEntities){
            ClassesResponseDTO classesResponseDTO = entityToDto(classesEntity);
            classesResponseDTOS.add(classesResponseDTO);
        }
        return classesResponseDTOS;
    }

}
