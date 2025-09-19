package com.personal.demoProject.dto.teacher;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class TeacherResponseDTO {

    private Integer teacherId;
    private String teacherName;
    private String emailId;
    private Integer phoneNo;
    private Date hiringDate;
    private Integer departmentId;
}
