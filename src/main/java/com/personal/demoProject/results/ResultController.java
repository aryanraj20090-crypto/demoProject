package com.personal.demoProject.results;


import com.personal.demoProject.dto.result.ResultRequestDTO;
import com.personal.demoProject.dto.result.ResultResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {


    private final ResultService _ResultService;

    public ResultController(ResultService resultService) {
        _ResultService = resultService;
    }

    @PostMapping("/")
    public ResultResponseDTO createResultSheet (@RequestBody ResultRequestDTO resultRequestDTO){
        ResultResponseDTO resultSheet = _ResultService.createResultSheet(resultRequestDTO);
        return resultSheet;
    }

    @GetMapping("/{id}")
    public ResultResponseDTO getResultByResultId (@PathVariable("id")Integer resultId){
        ResultResponseDTO resultByResultId = _ResultService.getResultByResultId(resultId);
        return resultByResultId;
    }
    @GetMapping("/all")
    public List<ResultResponseDTO> getAllResult(){
        List<ResultResponseDTO> allResult = _ResultService.getAllResult();
        return allResult;
    }



    @PutMapping("/{id}")
    public ResultResponseDTO updateResultSheet (@PathVariable("id") Integer resultId, ResultRequestDTO resultRequestDTO){
        ResultResponseDTO resultResponseDTO = _ResultService.updateResultSheet(resultId, resultRequestDTO);

        return resultResponseDTO;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResultSheetByResultId (@PathVariable("id") Integer resultId){
        _ResultService.deleteResultSheetByResultId(resultId);
        return ResponseEntity.noContent().build();
    }
}
