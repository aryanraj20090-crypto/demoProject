package com.personal.demoProject.attendance;


import com.personal.demoProject.dto.attendance.AttendanceRequestDTO;
import com.personal.demoProject.dto.attendance.AttendanceResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService{

    @Override
    public AttendanceResponseDTO createAttendanceSheet(AttendanceRequestDTO attendanceRequestDTO) {return null;}

    @Override
    public AttendanceResponseDTO getByAttendance(Integer attendance) {return null;}

    @Override
    public List<AttendanceResponseDTO> getAllAttendance() {return List.of();}

    @Override
    public AttendanceResponseDTO updateAttendance(AttendanceRequestDTO attendanceRequestDTO) {return null;}

    @Override
    public void deleteAttendanceSheetByAttendance(Integer attendance) {

    }
}
