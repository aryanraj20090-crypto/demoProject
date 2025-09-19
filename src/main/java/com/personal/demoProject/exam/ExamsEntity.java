package com.personal.demoProject.exam;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table (name = "exam")
public class ExamsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id")
    private Integer examId;
    @Column(name = "name")
    private String subjectName; // use (FK)
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Column(name = "class_id")
    private String classId; // use (FK)
}
