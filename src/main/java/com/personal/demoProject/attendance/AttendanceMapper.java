package com.personal.demoProject.attendance;

import com.personal.demoProject.dto.attendance.AttendanceRequestDTO;
import com.personal.demoProject.dto.attendance.AttendanceResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttendanceMapper {



    public AttendanceEntity dtoToEntity(AttendanceRequestDTO attendanceRequestDTO, AttendanceEntity attendanceEntity){

//        attendanceEntity.setAttendanceId(attendanceRequestDTO.getAttendanceId());
        attendanceEntity.setStudentId(attendanceRequestDTO.getStudentId());
        attendanceEntity.setDate(attendanceRequestDTO.getDate());
        attendanceEntity.setStatus(attendanceRequestDTO.getStatus());

        return attendanceEntity;

    }

    public AttendanceResponseDTO entityToDto(AttendanceEntity attendanceEntity){

        AttendanceResponseDTO attendanceResponseDTO = new AttendanceResponseDTO();

        attendanceResponseDTO.setAttendanceId(attendanceEntity.getAttendanceId());
        attendanceResponseDTO.setStudentId(attendanceEntity.getStudentId());
        attendanceResponseDTO.setDate(attendanceEntity.getDate());
        attendanceResponseDTO.setStatus(attendanceEntity.getStatus());

        return attendanceResponseDTO;
    }

    List<AttendanceResponseDTO> entitiesToDTOS(List<AttendanceEntity> attendanceEntities){
        List<AttendanceResponseDTO> attendanceResponseDTOS = new ArrayList<>();
        for (AttendanceEntity attendanceEntity : attendanceEntities){
            AttendanceResponseDTO attendanceResponseDTO = entityToDto(attendanceEntity);
            attendanceResponseDTOS.add(attendanceResponseDTO);
        }
        return attendanceResponseDTOS;
    }
}
