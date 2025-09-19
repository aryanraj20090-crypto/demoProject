package com.personal.demoProject.results;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "examResult")
public class ResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="result_id")
    private Integer resultId;
    @Column(name = "exam_id")
    private Integer examId; // use (FK)
    @Column(name = "student_rollNo")
    private Integer studentRollNo;
    @Column(name = "subject_name")
    private Integer subjectName; // use (FK)
    @Column(name = "marks")
    private Double marks;
    @Column(name = "grade")
    private String grade;
}
