package com.personal.demoProject.subject;

import com.personal.demoProject.dto.subject.SubjectRequestDTO;
import com.personal.demoProject.dto.subject.SubjectResponseDTO;

import java.util.List;

public interface SubjectService {
    SubjectResponseDTO createSubjectAccount(SubjectRequestDTO subjectRequestDTO);
    SubjectResponseDTO getSubjectBySubjectId(Integer subjectId);
    List<SubjectResponseDTO> getAllSubject();
    SubjectResponseDTO updateSubject (Integer subjectId, SubjectRequestDTO subjectRequestDTO);
    void deleteSubjectBySubjectId(Integer subjectId);
}
