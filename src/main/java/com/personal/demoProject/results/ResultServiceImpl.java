package com.personal.demoProject.results;

import com.personal.demoProject.dto.result.ResultRequestDTO;
import com.personal.demoProject.dto.result.ResultResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService{

    @Override
    public ResultResponseDTO createResultSheet(ResultRequestDTO resultRequestDTO) {return null;}

    @Override
    public ResultResponseDTO getResultByResultId(Integer resultId) {return null;}

    @Override
    public List<ResultResponseDTO> getAllResult() {return List.of();}

    @Override
    public ResultResponseDTO updateResultSheet(ResultRequestDTO resultRequestDTO) {return null;}

    @Override
    public void deleteResultSheetByResultId(Integer resultId) {

    }
}
