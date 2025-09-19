package com.personal.demoProject.departments;

import com.personal.demoProject.dto.department.DepartmentResponseDTO;

import java.util.List;

public interface DepartmentService {
    DepartmentResponseDTO createDepartmentOffice (DepartmentResponseDTO departmentResponseDTO);
    DepartmentResponseDTO getByDepartment (String department);
    List<DepartmentResponseDTO> getAllDepartment();
    DepartmentResponseDTO updateDepartment(DepartmentResponseDTO departmentResponseDTO);
    void deleteDepartmentOfficeByDepartment (String department);
}
