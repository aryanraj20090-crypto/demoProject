package com.personal.demoProject.dto.fees;

import lombok.Data;

import java.util.Date;

@Data
public class FeesRequestDTO {

    private Integer feesId;
    private Integer studentRollNo;// use (FK)
    private Double amount;
    private Date dueDate;
    private String feesStatus;
}
