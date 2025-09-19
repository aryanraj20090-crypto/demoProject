package com.personal.demoProject.subject;

import com.personal.demoProject.dto.subject.SubjectRequestDTO;
import com.personal.demoProject.dto.subject.SubjectResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectMapper {

    public SubjectEntity dtoToEntity(SubjectRequestDTO subjectRequestDTO, SubjectEntity subjectEntity){
        subjectEntity.setSubjectId(subjectRequestDTO.getSubjectId());
        subjectEntity.setSubjectName(subjectRequestDTO.getSubjectName());
        subjectEntity.setDeptId(subjectRequestDTO.getDeptId());

        return subjectEntity;
    }

    public SubjectResponseDTO entityToDto (SubjectEntity subjectEntity){
        SubjectResponseDTO subjectResponseDTO = new SubjectResponseDTO();
        subjectResponseDTO.setSubjectId(subjectEntity.getSubjectId());
        subjectResponseDTO.setSubjectName(subjectEntity.getSubjectName());
        subjectResponseDTO.setDeptId(subjectEntity.getDeptId());

        return subjectResponseDTO;
    }
    List<SubjectResponseDTO> entitiesToDTOS (List<SubjectEntity> subjectEntities){
        List<SubjectResponseDTO> subjectResponseDTOS = new ArrayList<>();
        for (SubjectEntity subjectEntity : subjectEntities){
            SubjectResponseDTO subjectResponseDTO = entityToDto(subjectEntity);
            subjectResponseDTOS.add(subjectResponseDTO);
        }
        return subjectResponseDTOS;
    }
}
