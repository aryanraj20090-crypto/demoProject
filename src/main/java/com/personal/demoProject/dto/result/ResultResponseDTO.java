package com.personal.demoProject.dto.result;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ResultResponseDTO {

    private Integer resultId;
    private Integer examId; // use (FK)
    private Integer studentRollNo;
    private Integer subjectName; // use (FK)
    private Double marks;
    private String grade;
}
