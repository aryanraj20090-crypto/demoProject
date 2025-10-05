package com.personal.demoProject.dto.fees;

import lombok.Data;

import java.util.Date;

@Data
public class FeesResponseDTO {

    private Integer feesId;
    private Integer studentId;// use (FK)
    private Double amount;
    private Date dueDate;
    private String feesStatus;
}
