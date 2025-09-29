package com.personal.demoProject.attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttendanceRepo extends JpaRepository <AttendanceEntity,Integer> {

   Optional<AttendanceEntity> findByAttendanceId(Integer attendanceId);
}
