package com.personal.demoProject.exam;

import com.personal.demoProject.dto.exam.ExamRequestDTO;
import com.personal.demoProject.dto.exam.ExamResponseDTO;

import java.util.List;

public interface ExamService {
    ExamResponseDTO createExamAccount (ExamRequestDTO examRequestDTO);
    ExamResponseDTO getByExamination (Integer examId);
    List<ExamResponseDTO> getAllExams();
    ExamResponseDTO updateExams (Integer examId, ExamRequestDTO examRequestDTO);
    void deleteExamAccountByExamId(Integer examId);
}
