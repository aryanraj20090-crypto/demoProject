package com.personal.demoProject.exam;

import com.personal.demoProject.dto.exam.ExamRequestDTO;
import com.personal.demoProject.dto.exam.ExamResponseDTO;

import java.util.List;

public interface ExamService {
    ExamResponseDTO createExamAccount (ExamRequestDTO examRequestDTO);
    ExamResponseDTO getByExamination (String exams);
    List<ExamResponseDTO> getAllExams();
    ExamResponseDTO updateExams (ExamRequestDTO examRequestDTO);
    void deleteExamAccountByExamination (String exams);
}
