package com.personal.demoProject.departments;

import com.personal.demoProject.dto.department.DepartmentResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements  DepartmentService{

    @Override
    public DepartmentResponseDTO createDepartmentOffice(DepartmentResponseDTO departmentResponseDTO) {return null;}

    @Override
    public DepartmentResponseDTO getByDepartment(String department) {return null;}

    @Override
    public List<DepartmentResponseDTO> getAllDepartment() {return List.of();}

    @Override
    public DepartmentResponseDTO updateDepartment(DepartmentResponseDTO departmentResponseDTO) {return null;}

    @Override
    public void deleteDepartmentOfficeByDepartment(String department) {

    }
}
