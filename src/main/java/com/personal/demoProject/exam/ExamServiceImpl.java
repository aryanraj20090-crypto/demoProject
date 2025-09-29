package com.personal.demoProject.exam;

import com.personal.demoProject.dto.exam.ExamRequestDTO;
import com.personal.demoProject.dto.exam.ExamResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamMapper _ExamMapper;
    private final ExamRepo _ExamRepo;

    public ExamServiceImpl (ExamMapper examMapper, ExamRepo examRepo){
        _ExamMapper = examMapper;
        _ExamRepo = examRepo;
    }

    @Override
    public ExamResponseDTO createExamAccount(ExamRequestDTO examRequestDTO) {
        if (examRequestDTO==null || examRequestDTO.equals(" ")){
            throw new RuntimeException("No data found please provide exam data ");
        }
        ExamsEntity examsEntity = new ExamsEntity();
        ExamsEntity examsEntity1 = _ExamMapper.dtoToEntity(examRequestDTO, examsEntity);
        ExamsEntity savedExamEntity = _ExamRepo.save(examsEntity1);
        ExamResponseDTO examResponseDTO = _ExamMapper.entityToDto(savedExamEntity);

        return examResponseDTO ;}

    @Override
    public ExamResponseDTO getByExamination(Integer examId) {
        Optional<ExamsEntity> examsEntity = _ExamRepo.findById(examId);
        if (examsEntity.isEmpty() || examsEntity==null){
            throw new EntityNotFoundException("No exam data found by exam id");
        }
        ExamResponseDTO examResponseDTO = _ExamMapper.entityToDto(examsEntity.get());

        return examResponseDTO;}

    @Override
    public List<ExamResponseDTO> getAllExams() {
        List<ExamsEntity> examsEntities = _ExamRepo.findAll();
        List<ExamResponseDTO> examResponseDTOS = _ExamMapper.entitiesToDTOS(examsEntities);

        return examResponseDTOS;
    }

    @Override
    public ExamResponseDTO updateExams(Integer examId, ExamRequestDTO examRequestDTO) {
        Optional<ExamsEntity> examsEntity = _ExamRepo.findById(examId);
        if (examsEntity.isEmpty() || examsEntity==null){
            throw new EntityNotFoundException("No exam data found by exam id");
        }
        ExamsEntity newExamsEntity = _ExamMapper.dtoToEntity(examRequestDTO, examsEntity.get());
        ExamsEntity updateExamEntity = _ExamRepo.save(newExamsEntity);
        ExamResponseDTO examResponseDTO = _ExamMapper.entityToDto(updateExamEntity);

        return examResponseDTO;}

    @Override
    public void deleteExamAccountByExamId(Integer examId) {
        Optional<ExamsEntity> examsEntity = _ExamRepo.findById(examId);
        if (examsEntity.isEmpty() || examsEntity==null){
            throw new EntityNotFoundException("No exam data found by exam id");
        }
        _ExamRepo.delete(examsEntity.get());

    }
}
