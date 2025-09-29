package com.personal.demoProject.attendance;


import com.personal.demoProject.dto.attendance.AttendanceRequestDTO;
import com.personal.demoProject.dto.attendance.AttendanceResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/attendance")
public class AttendanceController {


    private final AttendanceService _AttendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        _AttendanceService = attendanceService;
    }

    @PostMapping("/")
    public AttendanceResponseDTO createAttendanceSheet (@RequestBody AttendanceRequestDTO attendanceRequestDTO){

        AttendanceResponseDTO attendanceSheet = _AttendanceService.createAttendanceSheet(attendanceRequestDTO);

        return attendanceSheet;
    }
    @GetMapping("/{id}")
    public AttendanceResponseDTO getByAttendance(@PathVariable("id")Integer attendanceId){
        AttendanceResponseDTO attendanceResponseDTO = _AttendanceService.getByAttendance(attendanceId);

        return attendanceResponseDTO;
    }
    @GetMapping("/all")
    public List<AttendanceResponseDTO> getAllAttendance(){
        List<AttendanceResponseDTO> allAttendance = _AttendanceService.getAllAttendance();
        return allAttendance;
    }
    @PutMapping("/{id}")
    public AttendanceResponseDTO updateAttendance (@PathVariable("id") Integer attendanceId, AttendanceRequestDTO attendanceRequestDTO){
        AttendanceResponseDTO attendanceResponseDTO = _AttendanceService.updateAttendance(attendanceId, attendanceRequestDTO);
        return attendanceResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deleteAttendanceSheetByAttendanceId(@PathVariable("id") Integer attendanceId){
        _AttendanceService.deleteAttendanceSheetByAttendanceId(attendanceId);
        return ResponseEntity.noContent().build();
    }

}
