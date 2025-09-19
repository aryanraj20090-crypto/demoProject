package com.personal.demoProject.attendance;

import com.personal.demoProject.dto.attendance.AttendanceRequestDTO;
import com.personal.demoProject.dto.attendance.AttendanceResponseDTO;

import java.util.List;

public interface AttendanceService {
    AttendanceResponseDTO createAttendanceSheet (AttendanceRequestDTO attendanceRequestDTO);
    AttendanceResponseDTO getByAttendance (Integer attendance);
    List<AttendanceResponseDTO> getAllAttendance();
    AttendanceResponseDTO updateAttendance (AttendanceRequestDTO attendanceRequestDTO);
    void deleteAttendanceSheetByAttendance(Integer attendance);
}
