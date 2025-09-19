package com.personal.demoProject.dto.attendance;

import lombok.Data;

import java.util.Date;

@Data
public class AttendanceResponseDTO {
    private Integer attendance;
    private Integer studentId;// use (FK)
    private Date date;
    private String status;
}
