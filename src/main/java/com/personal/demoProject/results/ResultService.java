package com.personal.demoProject.results;

import com.personal.demoProject.dto.result.ResultRequestDTO;
import com.personal.demoProject.dto.result.ResultResponseDTO;

import java.util.List;

public interface ResultService {
    ResultResponseDTO createResultSheet (ResultRequestDTO resultRequestDTO);
    ResultResponseDTO getResultByResultId (Integer resultId);
    List<ResultResponseDTO> getAllResult();
    ResultResponseDTO updateResultSheet (Integer resultId, ResultRequestDTO resultRequestDTO);
    void deleteResultSheetByResultId (Integer resultId);
}
