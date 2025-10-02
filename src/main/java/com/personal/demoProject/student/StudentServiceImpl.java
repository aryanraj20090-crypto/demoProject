package com.personal.demoProject.student;

import com.personal.demoProject.dto.student.StudentRequestDTO;
import com.personal.demoProject.dto.student.StudentResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepo _studentRepo;

    private final StudentMapper _studentMapper;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper) {
        _studentRepo = studentRepo;
        _studentMapper = studentMapper;
    }

    @Override
    public StudentResponseDTO createStudentAccount(StudentRequestDTO studentRequestDTO) {
        if (studentRequestDTO ==null || studentRequestDTO.equals( " ")){
            throw new RuntimeException("No Data found please provide data to add student");
        }
        StudentEntity studentEntity = new StudentEntity();

        StudentEntity mappedStudentEntity = _studentMapper.dtoToEntity(studentRequestDTO, studentEntity);

        StudentEntity savedStudentEntity = _studentRepo.save(mappedStudentEntity);

        StudentResponseDTO studentResponseDTO = _studentMapper.entityToDto(savedStudentEntity);

        return studentResponseDTO;
    }

    @Override
    public StudentResponseDTO getStudentByStudentId(Integer studentId) {
        Optional<StudentEntity> studentEntity = _studentRepo.findByStudentId(studentId);
        if (studentEntity.isEmpty() || studentEntity == null){

            throw new EntityNotFoundException("No Student found for given roll number");
        }
        StudentResponseDTO studentResponseDTO = _studentMapper.entityToDto(studentEntity.get());

        return studentResponseDTO;
    }

    @Override
    public List<StudentResponseDTO> getAllStudent() {

        List<StudentEntity> studentEntities = _studentRepo.findAll();
        List<StudentResponseDTO> studentResponseDTOS = _studentMapper.entitiesToDTOS(studentEntities);
        return studentResponseDTOS;
    }

    @Override
    public StudentResponseDTO updateStudentAccount(Integer studentId, StudentRequestDTO studentRequestDTO) {
        Optional<StudentEntity> studentEntity = _studentRepo.findByStudentId(studentId);
        if (studentEntity.isEmpty() || studentEntity==null){
            throw new EntityNotFoundException("NO Student Find By Roll Number");
        }
        StudentEntity newStudentEntity = _studentMapper.dtoToEntity(studentRequestDTO, studentEntity.get());
        StudentEntity updatedEntity = _studentRepo.save(newStudentEntity);
        StudentResponseDTO studentResponseDTO = _studentMapper.entityToDto(updatedEntity);

        return studentResponseDTO;
    }

    @Override
    public void deleteStudentAccountByStudentId(Integer studentId) {

        Optional<StudentEntity> studentEntity = _studentRepo.findByStudentId(studentId);
        if (studentEntity.isEmpty() || studentEntity==null){
            throw new EntityNotFoundException("NO Student Find By Roll Number");
        }
        _studentRepo.delete(studentEntity.get());
    }
}