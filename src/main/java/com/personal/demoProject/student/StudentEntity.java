package com.personal.demoProject.student;

import com.personal.demoProject.guardian.GuardianEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name ="student")
public class StudentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "ad_dress")
    private  String address;
    @Column(name = "phone_No")
    private Long phoneNo;
    @Column (name = "guardian_Name")
    private String guardianName;
    @Column(name = "email_id")
    private String emailId;

}
