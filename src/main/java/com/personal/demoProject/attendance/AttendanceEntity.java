package com.personal.demoProject.attendance;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "attendance")
public class AttendanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Integer attendance;
    @Column (name ="student_id" )
    private Integer studentId;// use (FK)
    @Column(name = "date")
    private Date date;
    @Column(name = "status")
    private String status;
}
