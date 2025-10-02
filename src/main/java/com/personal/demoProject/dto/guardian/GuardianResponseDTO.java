package com.personal.demoProject.dto.guardian;

import com.personal.demoProject.student.StudentEntity;
import lombok.Data;

@Data
public class GuardianResponseDTO {

    private Integer guardianId;
    private String guardianName;
    private StudentEntity studentId; // use (PK)
    private String guardianRelationship;
    private Integer guardianPhoneNo;
    private String guardianEmail;
}
