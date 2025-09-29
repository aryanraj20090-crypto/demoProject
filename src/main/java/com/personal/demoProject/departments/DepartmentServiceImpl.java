package com.personal.demoProject.departments;

import com.personal.demoProject.dto.department.DepartmentRequestDTO;
import com.personal.demoProject.dto.department.DepartmentResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements  DepartmentService{
    private final DepartmentMapper _DepartmentMapper;
    private final  DepartmentRepo _DepartmentRepo;

    public DepartmentServiceImpl (DepartmentMapper departmentMapper, DepartmentRepo departmentRepo){
        _DepartmentMapper = departmentMapper;
        _DepartmentRepo = departmentRepo;
    }

    @Override
    public DepartmentResponseDTO createDepartmentOffice(DepartmentRequestDTO departmentRequestDTO) {
        if(departmentRequestDTO==null || departmentRequestDTO.equals(" ")){
            throw new RuntimeException("No data found please provide data to add department Office ");
        }
        DepartmentsEntity departmentsEntity = new DepartmentsEntity();
        DepartmentsEntity departmentsEntity1 = _DepartmentMapper.dtoToEntity(departmentRequestDTO, departmentsEntity);
        DepartmentsEntity savedDepartmentEntity = _DepartmentRepo.save(departmentsEntity1);
        DepartmentResponseDTO departmentResponseDTO = _DepartmentMapper.entityToDto(savedDepartmentEntity);

        return departmentResponseDTO;}

    @Override
    public DepartmentResponseDTO getByDepartment(Integer deptId) {
        Optional<DepartmentsEntity> departmentsEntity = _DepartmentRepo.findById(deptId);
        if(departmentsEntity.isEmpty() || departmentsEntity==null){
            throw new EntityNotFoundException("No Department found by department Id ");
        }
        DepartmentResponseDTO departmentResponseDTO = _DepartmentMapper.entityToDto(departmentsEntity.get());
        return departmentResponseDTO;}

    @Override
    public List<DepartmentResponseDTO> getAllDepartment() {
        List<DepartmentsEntity> departmentsEntities = _DepartmentRepo.findAll();
        List<DepartmentResponseDTO> departmentResponseDTOS = _DepartmentMapper.EntitiesToDTOS(departmentsEntities);
        return departmentResponseDTOS ;}

    @Override
    public DepartmentResponseDTO updateDepartment(Integer deptId, DepartmentRequestDTO departmentRequestDTO) {
        Optional<DepartmentsEntity> departmentEntity = _DepartmentRepo.findById(deptId);
        if(departmentEntity.isEmpty() || departmentEntity==null){
            throw new EntityNotFoundException("No department data found by deptId ");
        }
        DepartmentsEntity newDepartmentsEntity = _DepartmentMapper.dtoToEntity(departmentRequestDTO, departmentEntity.get());
        DepartmentsEntity updateDepartmentEntity = _DepartmentRepo.save(newDepartmentsEntity);
        DepartmentResponseDTO departmentResponseDTO = _DepartmentMapper.entityToDto(updateDepartmentEntity);

        return departmentResponseDTO;}

    @Override
    public void deleteDepartmentOfficeByDepartmentId(Integer deptId) {
        Optional<DepartmentsEntity> departmentEntity = _DepartmentRepo.findById(deptId);
        if(departmentEntity.isEmpty() || departmentEntity==null){
            throw new EntityNotFoundException("No department data found by deptId ");
        }
        _DepartmentRepo.delete(departmentEntity.get());

    }
}
