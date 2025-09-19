package com.personal.demoProject.dto.exam;

import lombok.Data;

@Data
public class ExamResponseDTO {
    private Integer examId;
    private String subjectName;
    private String date;
    private String time;
    private String classId;
}
