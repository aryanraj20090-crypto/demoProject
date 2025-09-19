package com.personal.demoProject.dto.attendance;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class AttendanceRequestDTO {
    private Integer attendance;
    private Integer studentId;// use (FK)
    private Date date;
    private String status;
}
