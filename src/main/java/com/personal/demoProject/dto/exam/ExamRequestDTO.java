package com.personal.demoProject.dto.exam;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ExamRequestDTO {
    private Integer examId;
    private String subjectName;
    private String date;
    private String time;
    private String classId;
}
