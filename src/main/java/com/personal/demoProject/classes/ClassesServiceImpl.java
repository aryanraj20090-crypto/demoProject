package com.personal.demoProject.classes;

import com.personal.demoProject.dto.classes.ClassesRequestDTO;
import com.personal.demoProject.dto.classes.ClassesResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassesServiceImpl implements ClassesService{

    private final ClassesMapper _ClassesMapper;
    private final ClassesRepo _ClassesRepo;

    public ClassesServiceImpl (ClassesMapper classesMapper, ClassesRepo classesRepo){
       _ClassesMapper = classesMapper;
       _ClassesRepo = classesRepo;
    }

    @Override
    public ClassesResponseDTO createClassRoom(ClassesRequestDTO classesRequestDTO) {
        if(classesRequestDTO==null || classesRequestDTO.equals(" ")){
            throw new RuntimeException("No Data found please provide data to add Classes ");
        }

        ClassesEntity classesEntity = new ClassesEntity();
        ClassesEntity classesEntity1 = _ClassesMapper.dtoToEntity(classesRequestDTO, classesEntity);
        ClassesEntity savedClassesEntity = _ClassesRepo.save(classesEntity1);
        ClassesResponseDTO classesResponseDTO = _ClassesMapper.entityToDto(savedClassesEntity);
        return classesResponseDTO;}

    @Override
    public ClassesResponseDTO getByClassName(Integer classRoom) {
        Optional<ClassesEntity> classesEntity = _ClassesRepo.findById(classRoom);
        if(classesEntity.isEmpty() || classesEntity==null){
            throw new EntityNotFoundException("No class room find by given class name ");
        }
        ClassesResponseDTO classesResponseDTO = _ClassesMapper.entityToDto(classesEntity.get());

        return classesResponseDTO;
    }

    @Override
    public List<ClassesResponseDTO> getAllClassRoom() {
        List<ClassesEntity> classesEntities = _ClassesRepo.findAll();
        List<ClassesResponseDTO> classesResponseDTOS = _ClassesMapper.entitiesToDTOS(classesEntities);

        return classesResponseDTOS;
    }
    @Override
    public ClassesResponseDTO updateClassRooms(Integer classId, ClassesRequestDTO classesRequestDTO) {
        Optional<ClassesEntity> classesEntity = _ClassesRepo.findById(classId);
        if(classesEntity.isEmpty() || classesEntity==null) {
            throw new EntityNotFoundException("No class room find by given class Id ");
        }
        ClassesEntity newClassEntity = _ClassesMapper.dtoToEntity(classesRequestDTO, classesEntity.get());
        ClassesEntity updateClassEntity = _ClassesRepo.save(newClassEntity);
        ClassesResponseDTO classesResponseDTO = _ClassesMapper.entityToDto(updateClassEntity);

        return classesResponseDTO;}

    @Override
    public void deleteClassId(Integer classId) {
        Optional<ClassesEntity> classesEntity = _ClassesRepo.findById(classId);
        if(classesEntity.isEmpty() || classesEntity==null) {
            throw new EntityNotFoundException("No class room find by given class Id ");
        }
        _ClassesRepo.delete(classesEntity.get());

    }
}
