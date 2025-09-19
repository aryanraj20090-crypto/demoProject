package com.personal.demoProject.exam;

import com.personal.demoProject.dto.exam.ExamRequestDTO;
import com.personal.demoProject.dto.exam.ExamResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Override
    public ExamResponseDTO createExamAccount(ExamRequestDTO examRequestDTO) {return null;}

    @Override
    public ExamResponseDTO getByExamination(String exams) {return null;}

    @Override
    public List<ExamResponseDTO> getAllExams() {return List.of();}

    @Override
    public ExamResponseDTO updateExams(ExamRequestDTO examRequestDTO) {return null;}

    @Override
    public void deleteExamAccountByExamination(String exams) {

    }
}
