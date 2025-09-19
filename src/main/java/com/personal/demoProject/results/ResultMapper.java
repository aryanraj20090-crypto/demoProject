package com.personal.demoProject.results;

import com.personal.demoProject.dto.result.ResultRequestDTO;
import com.personal.demoProject.dto.result.ResultResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultMapper {



    public ResultEntity dtoToEntity (ResultRequestDTO resultRequestDTO, ResultEntity resultEntity){
        resultEntity.setResultId(resultRequestDTO.getResultId());
        resultEntity.setExamId(resultRequestDTO.getExamId());
        resultEntity.setStudentRollNo(resultRequestDTO.getStudentRollNo());
        resultEntity.setSubjectName(resultRequestDTO.getSubjectName());
        resultEntity.setMarks(resultRequestDTO.getMarks());
        resultEntity.setGrade(resultRequestDTO.getGrade());

        return resultEntity;
    }

    public ResultResponseDTO entityToDto (ResultEntity resultEntity){
        ResultResponseDTO resultResponseDTO = new ResultResponseDTO();
        resultResponseDTO.setResultId(resultEntity.getResultId());
        resultResponseDTO.setExamId(resultEntity.getExamId());
        resultResponseDTO.setStudentRollNo(resultEntity.getStudentRollNo());
        resultResponseDTO.setSubjectName(resultEntity.getSubjectName());
        resultResponseDTO.setMarks(resultEntity.getMarks());
        resultResponseDTO.setGrade(resultEntity.getGrade());

        return resultResponseDTO;
    }
    List<ResultResponseDTO> entitiesToDTOS (List<ResultEntity> resultEntities){
        List<ResultResponseDTO> resultResponseDTOS = new ArrayList<>();
        for (ResultEntity resultEntity : resultEntities){
            ResultResponseDTO resultResponseDTO = entityToDto(resultEntity);
            resultResponseDTOS.add(resultResponseDTO);

        }
        return resultResponseDTOS;
    }
}
