package com.personal.demoProject.subject;

import com.personal.demoProject.dto.subject.SubjectRequestDTO;
import com.personal.demoProject.dto.subject.SubjectResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{

    @Override
    public SubjectResponseDTO createSubject(SubjectRequestDTO subjectRequestDTO) {return null;}

    @Override
    public SubjectResponseDTO getSubjectBySubjectName(String SubName) {return null;}

    @Override
    public List<SubjectResponseDTO> getAllSubject() {return List.of();}

    @Override
    public SubjectResponseDTO updateSubject(SubjectRequestDTO subjectRequestDTO) {return null;}

    @Override
    public void deleteSubjectBySubjectName(String subName) {

    }
}
