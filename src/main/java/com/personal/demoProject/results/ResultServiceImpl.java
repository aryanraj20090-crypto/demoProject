package com.personal.demoProject.results;

import com.personal.demoProject.dto.result.ResultRequestDTO;
import com.personal.demoProject.dto.result.ResultResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultServiceImpl implements ResultService{
    private final ResultMapper _ResultMapper;
    private final ResultRepo _ResultRepo;

    public ResultServiceImpl(ResultMapper resultMapper, ResultRepo resultRepo){
        _ResultMapper=resultMapper;
        _ResultRepo=resultRepo;
    }

    @Override
    public ResultResponseDTO createResultSheet(ResultRequestDTO resultRequestDTO) {
        if (resultRequestDTO==null || resultRequestDTO.equals(" ")){
            throw new RuntimeException("No data found please provide correct result data");
        }
        ResultEntity resultEntity = new ResultEntity();
        ResultEntity resultEntity1 = _ResultMapper.dtoToEntity(resultRequestDTO, resultEntity);
        ResultEntity savedResultEntity = _ResultRepo.save(resultEntity1);
        ResultResponseDTO resultResponseDTO = _ResultMapper.entityToDto(savedResultEntity);

        return resultResponseDTO;}

    @Override
    public ResultResponseDTO getResultByResultId(Integer resultId) {
        Optional<ResultEntity> resultEntity = _ResultRepo.findById(resultId);
        if (resultEntity.isEmpty() || resultEntity==null){
            throw new EntityNotFoundException("No data found for result");
        }
        ResultResponseDTO resultResponseDTO = _ResultMapper.entityToDto(resultEntity.get());

        return resultResponseDTO;
    }

    @Override
    public List<ResultResponseDTO> getAllResult() {
        List<ResultEntity> resultEntities = _ResultRepo.findAll();
        List<ResultResponseDTO> resultResponseDTOS = _ResultMapper.entitiesToDTOS(resultEntities);

        return resultResponseDTOS;
    }

    @Override
    public ResultResponseDTO updateResultSheet(Integer resultId, ResultRequestDTO resultRequestDTO) {
        Optional<ResultEntity> resultEntity = _ResultRepo.findById(resultId);
        if (resultEntity.isEmpty() || resultEntity==null){
            throw new EntityNotFoundException("No data found for result Id");
        }
        ResultEntity newResultEntity = _ResultMapper.dtoToEntity(resultRequestDTO, resultEntity.get());
        ResultEntity updateResultEntity = _ResultRepo.save(newResultEntity);
        ResultResponseDTO resultResponseDTO = _ResultMapper.entityToDto(updateResultEntity);

        return resultResponseDTO;
    }

    @Override
    public void deleteResultSheetByResultId(Integer resultId) {
        Optional<ResultEntity> resultEntity = _ResultRepo.findById(resultId);
        if (resultEntity.isEmpty() || resultEntity==null){
            throw new EntityNotFoundException("No data found for result Id");
        }
        _ResultRepo.delete(resultEntity.get());

    }
}
