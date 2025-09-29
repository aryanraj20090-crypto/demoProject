package com.personal.demoProject.teacher;


import com.personal.demoProject.dto.teacher.TeacherRequestDTO;
import com.personal.demoProject.dto.teacher.TeacherResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService _TeacherService;

    public TeacherController(TeacherService teacherService) {
        _TeacherService = teacherService;
    }


    @PostMapping("/")
    public TeacherResponseDTO createTeacherAccount (@RequestBody TeacherRequestDTO teacherRequestDTO){
        TeacherResponseDTO teacherAccount = _TeacherService.createTeacherAccount(teacherRequestDTO);
        return teacherAccount;
    }

    @GetMapping("/{id}")
    public TeacherResponseDTO getTeacherByTeacherName (@PathVariable("id") Integer teacherId){
        TeacherResponseDTO teacherByTeacherId = _TeacherService.getTeacherByTeacherId(teacherId);
        return teacherByTeacherId;
    }
    @GetMapping("/all")
    public List<TeacherResponseDTO> getAllTeacherName (){
        List<TeacherResponseDTO> allTeacherName = _TeacherService.getAllTeacherName();
        return allTeacherName;
    }


    @PutMapping("/{id}")
    public TeacherResponseDTO updateTeacherAccount (@PathVariable("id") Integer teacherId, TeacherRequestDTO teacherRequestDTO){
        TeacherResponseDTO teacherResponseDTO = _TeacherService.updateTeacherAccount(teacherId, teacherRequestDTO);
        return teacherResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacherAccountByTeacherId(Integer teacherId){
        _TeacherService.deleteTeacherAccountByTeacherId(teacherId);
        return ResponseEntity.noContent().build();
    }
}
