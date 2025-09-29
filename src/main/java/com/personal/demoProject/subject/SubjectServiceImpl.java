package com.personal.demoProject.subject;

import com.personal.demoProject.dto.subject.SubjectRequestDTO;
import com.personal.demoProject.dto.subject.SubjectResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService{
    private final SubjectMapper _SubjectMapper;
    private final SubjectRepo _SubjectRepo;

    public SubjectServiceImpl(SubjectMapper subjectMapper, SubjectRepo subjectRepo){
        _SubjectMapper=subjectMapper;
        _SubjectRepo=subjectRepo;
    }

    @Override
    public SubjectResponseDTO createSubjectAccount(SubjectRequestDTO subjectRequestDTO) {
        if (subjectRequestDTO==null || subjectRequestDTO.equals(" ")){
            throw new RuntimeException("No data found please provide subject data");
        }
        SubjectEntity subjectEntity = new SubjectEntity();
        SubjectEntity subjectEntity1 = _SubjectMapper.dtoToEntity(subjectRequestDTO, subjectEntity);
        SubjectEntity savedSubjectEntity = _SubjectRepo.save(subjectEntity1);
        SubjectResponseDTO subjectResponseDTO = _SubjectMapper.entityToDto(savedSubjectEntity);

        return subjectResponseDTO;}

    @Override
    public SubjectResponseDTO getSubjectBySubjectId(Integer subjectId) {
        Optional<SubjectEntity> subjectEntity = _SubjectRepo.findById(subjectId);
        if (subjectEntity.isEmpty() || subjectEntity==null){
            throw new EntityNotFoundException("no data found for subject name");
        }
        SubjectResponseDTO subjectResponseDTO = _SubjectMapper.entityToDto(subjectEntity.get());

        return subjectResponseDTO;}

    @Override
    public List<SubjectResponseDTO> getAllSubject() {
        List<SubjectEntity>subjectEntities=_SubjectRepo.findAll();
        List<SubjectResponseDTO> subjectResponseDTOS= _SubjectMapper.entitiesToDTOS(subjectEntities);

        return subjectResponseDTOS;
    }

    @Override
    public SubjectResponseDTO updateSubject(Integer subjectId, SubjectRequestDTO subjectRequestDTO) {
        Optional<SubjectEntity> subjectEntity = _SubjectRepo.findById(subjectId);
        if (subjectEntity.isEmpty() || subjectEntity==null){
            throw new EntityNotFoundException("no data found for subject name");
        }
        SubjectEntity newSubjectEntity = _SubjectMapper.dtoToEntity(subjectRequestDTO, subjectEntity.get());
        SubjectEntity updatedSubjectEntity = _SubjectRepo.save(newSubjectEntity);
        SubjectResponseDTO subjectResponseDTO = _SubjectMapper.entityToDto(updatedSubjectEntity);

        return subjectResponseDTO;}

    @Override
    public void deleteSubjectBySubjectId(Integer subjectId) {
        Optional<SubjectEntity> subjectEntity = _SubjectRepo.findById(subjectId);
        if (subjectEntity.isEmpty() || subjectEntity==null){
            throw new EntityNotFoundException("no data found for subject name");
        }
        _SubjectRepo.delete(subjectEntity.get());

    }
}
