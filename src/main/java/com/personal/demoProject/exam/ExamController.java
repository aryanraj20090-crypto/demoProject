package com.personal.demoProject.exam;


import com.personal.demoProject.dto.exam.ExamRequestDTO;
import com.personal.demoProject.dto.exam.ExamResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Exam")
public class ExamController {


    private final ExamService _ExamService;

    public ExamController(ExamService examService) {
        _ExamService = examService;
    }

    @PostMapping("/")
    public ExamResponseDTO createExamAccount (@RequestBody ExamRequestDTO examRequestDTO){

        ExamResponseDTO examAccount = _ExamService.createExamAccount(examRequestDTO);

        return examAccount;
    }
    @GetMapping("/{id}")
    public ExamResponseDTO getByExamination (@PathVariable("id")Integer examId){
        ExamResponseDTO byExamination = _ExamService.getByExamination(examId);

        return byExamination;
    }
    @GetMapping("/all")
    public List<ExamResponseDTO> getAllExams(){
        List<ExamResponseDTO> allExams = _ExamService.getAllExams();
        return allExams;
    }
    @PutMapping("/{id}")
    public ExamResponseDTO updateExams (@PathVariable("id") Integer examId, ExamRequestDTO examRequestDTO){
        ExamResponseDTO examResponseDTO = _ExamService.updateExams(examId, examRequestDTO);
        return examResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartmentOfficeByDepartmentId(@PathVariable("id") Integer deptId){
        _ExamService.deleteExamAccountByExamId(deptId);
        return ResponseEntity.noContent().build();
    }
}
