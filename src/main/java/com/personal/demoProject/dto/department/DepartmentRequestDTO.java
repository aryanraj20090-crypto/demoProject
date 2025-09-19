package com.personal.demoProject.dto.department;

import lombok.Data;

@Data
public class DepartmentRequestDTO {
    private Integer deptId;
    private String departmentName;
    private Integer departmentHeadId;
}
