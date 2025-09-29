package com.personal.demoProject.student;

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
    @Column(name = "roll_number")
    private Integer rollNumber;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "ad_dress")
    private  String address;
    @Column(name = "phone_No")
    private Long phoneNo;
    @Column(name = "guardian_Name")
    private String guardianName; // use (FK)
    @Column(name = "email_Id")
    private String emailId;

}
