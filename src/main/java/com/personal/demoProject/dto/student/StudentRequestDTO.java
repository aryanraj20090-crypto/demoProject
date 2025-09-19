package com.personal.demoProject.dto.student;

import lombok.Data;

@Data
public class StudentRequestDTO {
    private String firstName;
    private String lastName;
    private  String address;
    private Integer phoneNo;
    private String guardianName; // use (FK)
    private String emailId;
}
