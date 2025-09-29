package com.personal.demoProject.dto.attendance;

import lombok.Data;

import java.util.Date;

@Data
public class AttendanceRequestDTO {
    private Integer attendanceId;
    private Integer studentId;// use (FK)
    private Date date;
    private String status;
}
