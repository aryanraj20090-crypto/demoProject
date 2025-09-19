package com.personal.demoProject.dto.subject;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SubjectResponseDTO {

    private Integer subjectId;
    private String subjectName;
    private Integer deptId;
}
