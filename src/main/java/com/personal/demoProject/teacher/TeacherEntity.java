package com.personal.demoProject.teacher;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table (name = "classTeacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name ="teacherName" )
    private String teacherName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "phone_no")
    private Integer phoneNo;
    @Column(name = "hiring_date")
    private Date hiringDate;
    @Column(name = "dep_id")
    private Integer departmentId;  // use (FK)
}
