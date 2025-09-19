package com.personal.demoProject.exam;

import com.personal.demoProject.dto.exam.ExamRequestDTO;
import com.personal.demoProject.dto.exam.ExamResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamMapper {


    public ExamsEntity dtoToEntity(ExamRequestDTO examRequestDTO, ExamsEntity examsEntity){

        examsEntity.setExamId(examRequestDTO.getExamId());
        examsEntity.setSubjectName(examRequestDTO.getSubjectName());
        examsEntity.setDate(examRequestDTO.getDate());
        examsEntity.setTime(examsEntity.getTime());
        examsEntity.setClassId(examsEntity.getClassId());

        return examsEntity;
    }

    public ExamResponseDTO entityToDto (ExamsEntity examsEntity){
        ExamResponseDTO examResponseDTO = new ExamResponseDTO();
        examResponseDTO.setExamId(examsEntity.getExamId());
        examResponseDTO.setSubjectName(examsEntity.getSubjectName());
        examResponseDTO.setDate(examsEntity.getDate());
        examResponseDTO.setTime(examsEntity.getTime());
        examResponseDTO.setClassId(examsEntity.getClassId());

        return examResponseDTO;
    }
    List<ExamResponseDTO> entitiesToDTOS (List<ExamsEntity> examsEntities){
        List<ExamResponseDTO> examResponseDTOS =new ArrayList<>();
        for(ExamsEntity examsEntity: examsEntities){
            ExamResponseDTO examResponseDTO = entityToDto(examsEntity);
            examResponseDTOS.add(examResponseDTO);

        }
        return examResponseDTOS;
    }
}
