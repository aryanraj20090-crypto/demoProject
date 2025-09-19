package com.personal.demoProject.departments;

import com.personal.demoProject.dto.department.DepartmentRequestDTO;
import com.personal.demoProject.dto.department.DepartmentResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentMapper {

    public DepartmentsEntity dtoToEntity(DepartmentRequestDTO departmentRequestDTO, DepartmentsEntity departmentsEntity){

        departmentsEntity.setDeptId(departmentRequestDTO.getDeptId());
        departmentsEntity.setDepartmentName(departmentRequestDTO.getDepartmentName());
        departmentsEntity.setDepartmentHeadId(departmentRequestDTO.getDepartmentHeadId());

        return departmentsEntity;

    }

    public DepartmentResponseDTO entityToDto (DepartmentsEntity departmentsEntity){

        DepartmentResponseDTO departmentResponseDTO = new DepartmentResponseDTO();
        departmentResponseDTO.setDeptId(departmentsEntity.getDeptId());
        departmentResponseDTO.setDepartmentName(departmentsEntity.getDepartmentName());
        departmentResponseDTO.setDepartmentHeadId(departmentsEntity.getDepartmentHeadId());

        return departmentResponseDTO;

    }
    List<DepartmentResponseDTO> EntitiesToDTOS (List<DepartmentsEntity> departmentsEntities){
        List<DepartmentResponseDTO> departmentResponseDTOS = new ArrayList<>();
        for (DepartmentsEntity departmentsEntity : departmentsEntities){
            DepartmentResponseDTO departmentResponseDTO = entityToDto(departmentsEntity);
            departmentResponseDTOS.add(departmentResponseDTO);

        }
        return departmentResponseDTOS;
    }
}
