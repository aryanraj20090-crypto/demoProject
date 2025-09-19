package com.personal.demoProject.dto.result;

import lombok.Data;

@Data
public class ResultRequestDTO {

    private Integer resultId;
    private Integer examId; // use (FK)
    private Integer studentRollNo;
    private Integer subjectName; // use (FK)
    private Double marks;
    private String grade;
}
