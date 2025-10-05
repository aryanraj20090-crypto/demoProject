package com.personal.demoProject.dto.student;

import com.personal.demoProject.guardian.GuardianEntity;
import lombok.Data;

@Data
public class StudentResponseDTO {

    private Integer studentId;
    private String firstName;
    private String lastName;
    private  String address;
    private Long phoneNo;
    private String guardianName; // use (FK)
    private String emailId;
}
