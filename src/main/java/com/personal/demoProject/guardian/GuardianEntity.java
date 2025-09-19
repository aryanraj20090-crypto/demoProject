package com.personal.demoProject.guardian;


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
    private Integer guardianId;
    @Column(name = "guardian_name")
    private String guardianName;
    @Column(name = "student_name")
    private String studentName; // use (PK)
    @Column(name = "guardian_relationship")
    private String guardianRelationship;
    @Column(name = "guardian_phoneNo")
    private Integer guardianPhoneNo;
    @Column(name = "guardian_email")
    private String guardianEmail;
}
