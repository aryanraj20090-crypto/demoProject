package com.personal.demoProject.subject;


import com.personal.demoProject.dto.subject.SubjectRequestDTO;
import com.personal.demoProject.dto.subject.SubjectResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectService _SubjectService;

    public SubjectController(SubjectService subjectService) {
        _SubjectService = subjectService;
    }


    @PostMapping("/")
    public SubjectResponseDTO createSubject (@RequestBody SubjectRequestDTO subjectRequestDTO){
        SubjectResponseDTO subjectAccount = _SubjectService.createSubjectAccount(subjectRequestDTO);

        return subjectAccount;
    }

    @GetMapping("/{id}")
    public SubjectResponseDTO getSubjectBySubjectId(@PathVariable("id")Integer subjectId){
        SubjectResponseDTO subjectBySubjectId = _SubjectService.getSubjectBySubjectId(subjectId);

        return subjectBySubjectId;
    }
    @GetMapping("/all")
    public List<SubjectResponseDTO> getAllSubject(){
        List<SubjectResponseDTO> allSubject = _SubjectService.getAllSubject();
        return allSubject;
    }


    @PutMapping("/{id}")
    public SubjectResponseDTO updateSubject (@PathVariable("id") Integer subjectId, SubjectRequestDTO subjectRequestDTO){
        SubjectResponseDTO subjectResponseDTO = _SubjectService.updateSubject(subjectId, subjectRequestDTO);
        return subjectResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubjectBySubjectId(@PathVariable("id") Integer subjectId){
        _SubjectService.deleteSubjectBySubjectId(subjectId);
        return ResponseEntity.noContent().build();
    }
}
