package com.personal.demoProject.fees;

import com.personal.demoProject.dto.fees.FeesRequestDTO;
import com.personal.demoProject.dto.fees.FeesResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeesServiceImpl implements FeesService {
    private final FeesMapper _FeesMapper;
    private final FeesRepo _FeesRepo;

    public FeesServiceImpl (FeesMapper feesMapper, FeesRepo feesRepo){
        _FeesMapper = feesMapper;
        _FeesRepo = feesRepo;
    }

    @Override
    public FeesResponseDTO createFeesAccount(FeesRequestDTO feesRequestDTO) {
        if (feesRequestDTO==null || feesRequestDTO.equals(" ")){
            throw  new RuntimeException("No data found by please provide fees Id ");
        }
        FeesEntity feesEntity = new FeesEntity();
        FeesEntity feesEntity1 = _FeesMapper.dtoToEntity(feesRequestDTO, feesEntity);
        FeesEntity savedFeesEntity = _FeesRepo.save(feesEntity1);
        FeesResponseDTO feesResponseDTO = _FeesMapper.entityToDto(savedFeesEntity);

        return feesResponseDTO;}

    @Override
    public FeesResponseDTO getByFeesId(Integer feesId) {
        Optional<FeesEntity> feesEntity = _FeesRepo.findById(feesId);
        if (feesEntity.isEmpty() || feesEntity==null){
            throw new EntityNotFoundException("No data found from fees Id");
        }
        FeesResponseDTO feesResponseDTO = _FeesMapper.entityToDto(feesEntity.get());

        return feesResponseDTO;}

    @Override
    public List<FeesResponseDTO> getAllFees() {
        List<FeesEntity> feesEntities = _FeesRepo.findAll();
        List<FeesResponseDTO> feesResponseDTOS = _FeesMapper.entitiesToDTOS(feesEntities);

        return feesResponseDTOS;
    }

    @Override
    public FeesResponseDTO updateFeesAccount(Integer feesId, FeesRequestDTO feesRequestDTO) {
        Optional<FeesEntity> feesEntity = _FeesRepo.findById(feesId);
        if (feesEntity.isEmpty() || feesEntity==null){
            throw new EntityNotFoundException("No data found from fees Id");
        }
        FeesEntity newFeesEntity = _FeesMapper.dtoToEntity(feesRequestDTO, feesEntity.get());
        FeesEntity updateFeesEntity = _FeesRepo.save(newFeesEntity);
        FeesResponseDTO feesResponseDTO = _FeesMapper.entityToDto(updateFeesEntity);

        return feesResponseDTO;}

    @Override
    public void deleteFeesAccountByFeesId(Integer feesId) {
        Optional<FeesEntity> feesEntity = _FeesRepo.findById(feesId);
        if (feesEntity.isEmpty() || feesEntity==null){
            throw new EntityNotFoundException("No data found from fees Id");
        }
        _FeesRepo.delete(feesEntity.get());

    }
}
