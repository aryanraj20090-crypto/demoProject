package com.personal.demoProject.guardian;

import com.personal.demoProject.dto.guardian.GuardianRequestDTO;
import com.personal.demoProject.dto.guardian.GuardianResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuardianMapper {



    public GuardianEntity dtoToEntity(GuardianRequestDTO guardianRequestDTO, GuardianEntity guardianEntity){
        guardianEntity.setGuardianId(guardianRequestDTO.getGuardianId());
        guardianEntity.setGuardianName(guardianRequestDTO.getGuardianName());
        guardianEntity.setStudentId(guardianRequestDTO.getStudentId());
        guardianEntity.setGuardianRelationship(guardianRequestDTO.getGuardianRelationship());
        guardianEntity.setGuardianPhoneNo(guardianRequestDTO.getGuardianPhoneNo());
        guardianEntity.setGuardianEmail(guardianRequestDTO.getGuardianEmail());

        return guardianEntity;
    }

    public GuardianResponseDTO entityToDto (GuardianEntity guardianEntity){

        GuardianResponseDTO guardianResponseDTO = new GuardianResponseDTO();
        guardianResponseDTO.setGuardianId(guardianEntity.getGuardianId());
        guardianResponseDTO.setGuardianName(guardianEntity.getGuardianName());
        guardianResponseDTO.setStudentId(guardianEntity.getStudentId());
        guardianResponseDTO.setGuardianRelationship(guardianEntity.getGuardianRelationship());
        guardianResponseDTO.setGuardianPhoneNo(guardianEntity.getGuardianPhoneNo());
        guardianResponseDTO.setGuardianEmail(guardianEntity.getGuardianEmail());

        return guardianResponseDTO;
    }
    List<GuardianResponseDTO> entitiesToDTOS (List<GuardianEntity> guardianEntities){
        List<GuardianResponseDTO> guardianResponseDTOS = new ArrayList<>();
        for(GuardianEntity guardianEntity : guardianEntities){
            GuardianResponseDTO guardianResponseDTO = entityToDto(guardianEntity);
            guardianResponseDTOS.add(guardianResponseDTO);
        }
        return guardianResponseDTOS;
    }
}
