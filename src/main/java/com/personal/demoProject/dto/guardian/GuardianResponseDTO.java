package com.personal.demoProject.dto.guardian;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class GuardianResponseDTO {

    private Integer guardianId;
    private String guardianName;
    private String studentName; // use (PK)
    private String guardianRelationship;
    private Integer guardianPhoneNo;
    private String guardianEmail;
}
