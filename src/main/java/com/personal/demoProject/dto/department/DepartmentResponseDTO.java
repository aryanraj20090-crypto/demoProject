package com.personal.demoProject.dto.department;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DepartmentResponseDTO {
    private Integer deptId;
    private String departmentName;
    private Integer departmentHeadId;
}
