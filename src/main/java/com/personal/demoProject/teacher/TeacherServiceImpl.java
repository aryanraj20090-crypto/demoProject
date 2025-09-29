package com.personal.demoProject.teacher;

import com.personal.demoProject.dto.teacher.TeacherRequestDTO;
import com.personal.demoProject.dto.teacher.TeacherResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{
    private final TeacherMapper _TeacherMapper;
    private final TeacherRepo _TeacherRepo;

    public TeacherServiceImpl(TeacherMapper teacherMapper, TeacherRepo teacherRepo){
        _TeacherMapper=teacherMapper;
        _TeacherRepo=teacherRepo;
    }

    @Override
    public TeacherResponseDTO createTeacherAccount(TeacherRequestDTO teacherRequestDTO) {
        if (teacherRequestDTO==null || teacherRequestDTO.equals(" ")){
            throw new RuntimeException("No data found please provide teachers data ");
        }
        TeacherEntity teacherEntity = new TeacherEntity();
        TeacherEntity teacherEntity1 = _TeacherMapper.dtoToEntity(teacherRequestDTO, teacherEntity);
        TeacherEntity savedTeacherEntity = _TeacherRepo.save(teacherEntity1);
        TeacherResponseDTO teacherResponseDTO = _TeacherMapper.entityToDto(savedTeacherEntity);

        return teacherResponseDTO;}

    @Override
    public TeacherResponseDTO getTeacherByTeacherId(Integer teacherId) {
        Optional<TeacherEntity> teacherEntity = _TeacherRepo.findById(teacherId);
        if (teacherEntity.isEmpty() || teacherEntity==null){
            throw new EntityNotFoundException("No data for teacher name");
        }
        TeacherResponseDTO teacherResponseDTO = _TeacherMapper.entityToDto(teacherEntity.get());

        return teacherResponseDTO;}

    @Override
    public List<TeacherResponseDTO> getAllTeacherName() {
        List<TeacherEntity> teacherEntities = _TeacherRepo.findAll();
        List<TeacherResponseDTO> teacherResponseDTOS = _TeacherMapper.entitiesToDTOS(teacherEntities);

        return teacherResponseDTOS;
    }

    @Override
    public TeacherResponseDTO updateTeacherAccount(Integer teacherId,TeacherRequestDTO teacherRequestDTO) {
        Optional<TeacherEntity> teacherEntity = _TeacherRepo.findById(teacherId);
        if (teacherEntity.isEmpty() || teacherEntity==null){
            throw new EntityNotFoundException("No data for teacher name");
        }
        TeacherEntity newTeacherEntity = _TeacherMapper.dtoToEntity(teacherRequestDTO, teacherEntity.get());
        TeacherEntity savedTeacherEntity = _TeacherRepo.save(newTeacherEntity);
        TeacherResponseDTO teacherResponseDTO = _TeacherMapper.entityToDto(savedTeacherEntity);

        return teacherResponseDTO;
    }

    @Override
    public void deleteTeacherAccountByTeacherId(Integer teacherId) {
        Optional<TeacherEntity> teacherEntity = _TeacherRepo.findById(teacherId);
        if (teacherEntity.isEmpty() || teacherEntity==null){
            throw new EntityNotFoundException("No data for teacher name");
        }
        _TeacherRepo.delete(teacherEntity.get());

    }
}
