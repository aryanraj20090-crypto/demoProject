package com.personal.demoProject.fees;

import com.personal.demoProject.dto.exam.ExamResponseDTO;
import com.personal.demoProject.dto.fees.FeesRequestDTO;
import com.personal.demoProject.dto.fees.FeesResponseDTO;
import com.personal.demoProject.exam.ExamsEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeesMapper {


    public FeesEntity dtoToEntity(FeesRequestDTO feesRequestDTO, FeesEntity feesEntity){

        feesEntity.setFeesId(feesRequestDTO.getFeesId());
        feesEntity.setStudentRollNo(feesRequestDTO.getStudentRollNo());
        feesEntity.setAmount(feesRequestDTO.getAmount());
        feesEntity.setDueDate(feesRequestDTO.getDueDate());
        feesEntity.setFeesStatus(feesEntity.getFeesStatus());

        return feesEntity;
    }

    public FeesResponseDTO entityToDto (FeesEntity feesEntity){
        FeesResponseDTO feesResponseDTO = new FeesResponseDTO();
        feesResponseDTO.setFeesId(feesEntity.getFeesId());
        feesResponseDTO.setStudentRollNo(feesEntity.getStudentRollNo());
        feesResponseDTO.setAmount(feesEntity.getAmount());
        feesResponseDTO.setDueDate(feesEntity.getDueDate());
        feesResponseDTO.setFeesStatus(feesEntity.getFeesStatus());

        return feesResponseDTO;
    }
    List<FeesResponseDTO> entitiesToDTOS (List<FeesEntity> feesEntities){
        List<FeesResponseDTO> feesResponseDTOS = new ArrayList<>();
        for (FeesEntity feesEntity : feesEntities){
            FeesResponseDTO feesResponseDTO = entityToDto(feesEntity);
            feesResponseDTOS.add(feesResponseDTO);

        }
        return feesResponseDTOS;
    }

}
