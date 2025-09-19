package com.personal.demoProject.subject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table (name = "subjects")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id")
    private Integer subjectId;
    @Column(name = "subject_name")
    private String subjectName;
    @Column(name = "dept_id")
    private Integer deptId; // use (FK)
}
