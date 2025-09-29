package com.personal.demoProject.guardian;

import com.personal.demoProject.dto.guardian.GuardianRequestDTO;
import com.personal.demoProject.dto.guardian.GuardianResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianServiceImpl implements GuardianService{
    private final GuardianMapper _GuardianMapper;
    private final GuardianRepo _GuardianRepo;

    public GuardianServiceImpl (GuardianMapper guardianMapper, GuardianRepo guardianRepo){
        _GuardianMapper = guardianMapper;
        _GuardianRepo = guardianRepo;
    }

    @Override
    public GuardianResponseDTO createGuardianAccount(GuardianRequestDTO guardianRequestDTO) {
        if (guardianRequestDTO==null || guardianRequestDTO.equals(" ")){
            throw new RuntimeException("No data found please provide correct Guardian Account");
        }
        GuardianEntity guardianEntity = new GuardianEntity();
        GuardianEntity guardianEntity1 = _GuardianMapper.dtoToEntity(guardianRequestDTO, guardianEntity);
        GuardianEntity savedGuardianEntity = _GuardianRepo.save(guardianEntity1);
        GuardianResponseDTO guardianResponseDTO = _GuardianMapper.entityToDto(savedGuardianEntity);

        return guardianResponseDTO;}

    @Override
    public GuardianResponseDTO getGuardiansByGuardianId(Integer guardianId) {
        Optional<GuardianEntity> guardianEntity = _GuardianRepo.findById(guardianId);
        if (guardianEntity.isEmpty() || guardianEntity==null){
            throw new EntityNotFoundException("No data found by Guardian id");
        }
        GuardianResponseDTO guardianResponseDTO = _GuardianMapper.entityToDto(guardianEntity.get());

        return guardianResponseDTO;}

    @Override
    public List<GuardianResponseDTO> getAllGuardian() {
        List<GuardianEntity> guardianEntities = _GuardianRepo.findAll();
        List<GuardianResponseDTO> guardianResponseDTOS = _GuardianMapper.entitiesToDTOS(guardianEntities);
        return guardianResponseDTOS;
    }

    @Override
    public GuardianResponseDTO UpdateGuardianAccount(Integer guardianId,GuardianRequestDTO guardianRequestDTO) {
        Optional<GuardianEntity> guardianEntity = _GuardianRepo.findById(guardianId);
        if (guardianEntity.isEmpty() || guardianEntity==null){
            throw new EntityNotFoundException("No data found by Guardian id");
        }
        GuardianEntity newGuardianEntity = _GuardianMapper.dtoToEntity(guardianRequestDTO, guardianEntity.get());
        GuardianEntity updateGuardianEntity = _GuardianRepo.save(newGuardianEntity);
        GuardianResponseDTO guardianResponseDTO = _GuardianMapper.entityToDto(updateGuardianEntity);

        return guardianResponseDTO;}

    @Override
    public void deleteGuardianAccountByGuardianId(Integer guardianId) {
        Optional<GuardianEntity> guardianEntity = _GuardianRepo.findById(guardianId);
        if (guardianEntity.isEmpty() || guardianEntity==null){
            throw new EntityNotFoundException("No data found by Guardian id");
        }
        _GuardianRepo.delete(guardianEntity.get());

    }
}
