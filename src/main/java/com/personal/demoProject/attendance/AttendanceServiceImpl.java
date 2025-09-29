package com.personal.demoProject.attendance;


import com.personal.demoProject.dto.attendance.AttendanceRequestDTO;
import com.personal.demoProject.dto.attendance.AttendanceResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService{

    private final AttendanceMapper _AttendanceMapper;
    private final AttendanceRepo _AttendanceRepo;

    public AttendanceServiceImpl(AttendanceMapper attendanceMapper, AttendanceRepo attendanceRepo) {
        _AttendanceMapper = attendanceMapper;
        _AttendanceRepo = attendanceRepo;
    }

    @Override
    public AttendanceResponseDTO createAttendanceSheet(AttendanceRequestDTO attendanceRequestDTO) {
        if(attendanceRequestDTO== null || attendanceRequestDTO.equals(" ")){
            throw new RuntimeException("No Data found please provide data to add attendance ");
        }

        AttendanceEntity attendanceEntity= new AttendanceEntity();
        AttendanceEntity attendanceEntity1 = _AttendanceMapper.dtoToEntity(attendanceRequestDTO, attendanceEntity);
        AttendanceEntity savedAttendanceEntity = _AttendanceRepo.save(attendanceEntity1);
        AttendanceResponseDTO attendanceResponseDTO = _AttendanceMapper.entityToDto(savedAttendanceEntity);

        return attendanceResponseDTO;
    }

    @Override
    public AttendanceResponseDTO getByAttendance(Integer attendanceId) {
        Optional<AttendanceEntity> attendanceEntity = _AttendanceRepo.findByAttendanceId(attendanceId);
        if (attendanceEntity.isEmpty() || attendanceEntity== null){
            throw new EntityNotFoundException("No student found for given attendance");
        }
        AttendanceResponseDTO attendanceResponseDTO = _AttendanceMapper.entityToDto(attendanceEntity.get());

        return attendanceResponseDTO;
    }

    @Override
    public List<AttendanceResponseDTO> getAllAttendance() {
        List<AttendanceEntity> attendanceEntities = _AttendanceRepo.findAll();
        List<AttendanceResponseDTO> attendanceResponseDTOS = _AttendanceMapper.entitiesToDTOS(attendanceEntities);

        return attendanceResponseDTOS ;
    }

    @Override
    public AttendanceResponseDTO updateAttendance(Integer attendanceId, AttendanceRequestDTO attendanceRequestDTO) {
        Optional<AttendanceEntity> attendanceEntity = _AttendanceRepo.findByAttendanceId(attendanceId);
        if(attendanceEntity.isEmpty() || attendanceEntity==null){
            throw new EntityNotFoundException(" No student find by attendance id");
        }
        AttendanceEntity newAttendanceEntity= _AttendanceMapper.dtoToEntity(attendanceRequestDTO,attendanceEntity.get());
        AttendanceEntity updateEntity = _AttendanceRepo.save(newAttendanceEntity);
        AttendanceResponseDTO attendanceResponseDTO = _AttendanceMapper.entityToDto(updateEntity);
        return attendanceResponseDTO;}

    @Override
    public void deleteAttendanceSheetByAttendanceId(Integer attendanceId) {
        Optional<AttendanceEntity> attendanceEntity = _AttendanceRepo.findByAttendanceId(attendanceId);
        if(attendanceEntity.isEmpty() || attendanceEntity==null){
            throw new EntityNotFoundException(" No student find by attendanceId ");
        }
        _AttendanceRepo.delete(attendanceEntity.get());

    }
}
