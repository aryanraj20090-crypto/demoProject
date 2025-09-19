package com.personal.demoProject.fees;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "studentFees")
public class FeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fees_id")
    private Integer feesId;
    @Column(name = "student_rollNo")
    private Integer studentRollNo;// use (FK)
    @Column(name = "amount")
    private Double amount;
    @Column(name = "due_date")
    private Date dueDate;
    @Column(name = "fees_status")
    private String feesStatus; // (paid or pending)
}
