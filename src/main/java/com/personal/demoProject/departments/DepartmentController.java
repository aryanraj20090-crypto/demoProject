package com.personal.demoProject.departments;


import com.personal.demoProject.classes.ClassesService;
import com.personal.demoProject.dto.classes.ClassesRequestDTO;
import com.personal.demoProject.dto.department.DepartmentRequestDTO;
import com.personal.demoProject.dto.department.DepartmentResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/department")
@RequestMapping
public class DepartmentController {


    private final DepartmentService _DepartmentService;

    public DepartmentController(DepartmentService departmentService) {
        _DepartmentService = departmentService;
    }

    @PostMapping("/")
    public DepartmentResponseDTO createDepartmentOffice (@RequestBody DepartmentRequestDTO departmentRequestDTO){

        DepartmentResponseDTO departmentOffice = _DepartmentService.createDepartmentOffice(departmentRequestDTO);
        return departmentOffice;
    }

    @GetMapping("/{id}")
    public DepartmentResponseDTO getByDepartment(@PathVariable("id")Integer deptId){
        DepartmentResponseDTO byDepartmentId = _DepartmentService.getByDepartment(deptId);
        return byDepartmentId;
    }
    @GetMapping("/all")
    public List<DepartmentResponseDTO> getAllDepartment(){
        List<DepartmentResponseDTO> allDepartment = _DepartmentService.getAllDepartment();
        return allDepartment;
    }
    @PutMapping("/{id}")
    public DepartmentResponseDTO updateDepartment(@PathVariable("id") Integer deptId, DepartmentRequestDTO departmentRequestDTO){
        DepartmentResponseDTO departmentResponseDTO = _DepartmentService.updateDepartment(deptId, departmentRequestDTO);
        return departmentResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartmentOfficeByDepartmentId(@PathVariable("id") Integer deptId){
        _DepartmentService.deleteDepartmentOfficeByDepartmentId(deptId);
        return ResponseEntity.noContent().build();
    }
}
