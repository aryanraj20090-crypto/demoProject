package com.personal.demoProject.dto.guardian;

import lombok.Data;

@Data
public class GuardianRequestDTO {

    private Integer guardianId;
    private String guardianName;
    private String studentName; // use (PK)
    private String guardianRelationship;
    private Integer guardianPhoneNo;
    private String guardianEmail;
}
