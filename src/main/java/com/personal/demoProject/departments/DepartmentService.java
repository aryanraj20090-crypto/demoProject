package com.personal.demoProject.departments;

import com.personal.demoProject.dto.department.DepartmentRequestDTO;
import com.personal.demoProject.dto.department.DepartmentResponseDTO;

import java.util.List;

public interface DepartmentService {
    DepartmentResponseDTO createDepartmentOffice (DepartmentRequestDTO departmentRequestDTO);
    DepartmentResponseDTO getByDepartment (Integer deptId);
    List<DepartmentResponseDTO> getAllDepartment();
    DepartmentResponseDTO updateDepartment(Integer deptId, DepartmentRequestDTO departmentRequestDTO);
    void deleteDepartmentOfficeByDepartmentId(Integer deptId);
}
