package com.personal.demoProject.subject;

import com.personal.demoProject.dto.subject.SubjectRequestDTO;
import com.personal.demoProject.dto.subject.SubjectResponseDTO;

import java.util.List;

public interface SubjectService {
    SubjectResponseDTO createSubject (SubjectRequestDTO subjectRequestDTO);
    SubjectResponseDTO getSubjectBySubjectName (String SubName);
    List<SubjectResponseDTO> getAllSubject();
    SubjectResponseDTO updateSubject (SubjectRequestDTO subjectRequestDTO);
    void deleteSubjectBySubjectName (String subName);
}
