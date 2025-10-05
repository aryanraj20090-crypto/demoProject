package com.personal.demoProject.guardian;


import com.personal.demoProject.student.StudentEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "guardian")

public class GuardianEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "guardian_id")
    private Integer guardianId; // use (PK)
    @Column (name = "guardian_name")
    private String guardianName;
    @ManyToOne (cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn (name = "student_id")
    private StudentEntity studentId; // use (FK)
    @Column(name = "guardian_relationship")
    private String guardianRelationship;
    @Column(name = "guardian_phoneNo")
    private Integer guardianPhoneNo;
    @Column(name = "guardian_email")
    private String guardianEmail;
}
