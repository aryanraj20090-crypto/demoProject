package com.personal.demoProject.student;

import com.personal.demoProject.dto.student.StudentRequestDTO;
import com.personal.demoProject.dto.student.StudentResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    private final StudentService _StudentService;

    @Autowired
    public StudentController(StudentService studentService) {
        _StudentService = studentService;
    }


    @PostMapping("/")
    public StudentResponseDTO createStudentAccount(@RequestBody StudentRequestDTO studentRequestDTO){

        StudentResponseDTO studentAccount = _StudentService.createStudentAccount(studentRequestDTO);

        return studentAccount;
    }

    @GetMapping("/{studentId}")
    public StudentResponseDTO getStudentAccountByStudentId(@PathVariable ("studentId") Integer studentId){

        StudentResponseDTO studentByStudentId = _StudentService.getStudentByStudentId(studentId);

        return studentByStudentId;
    }

    @GetMapping("/all")
    public List<StudentResponseDTO> gstAllStudent(){
        List<StudentResponseDTO> allStudent = _StudentService.getAllStudent();
        return allStudent;
    }
    @PutMapping("/{studentId}")
    public StudentResponseDTO updateStudentAccount(@PathVariable("studentId") Integer rollNumber, StudentRequestDTO studentRequestDTO){
        StudentResponseDTO studentResponseDTO = _StudentService.updateStudentAccount(rollNumber, studentRequestDTO);
        return studentResponseDTO;
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudentAccountByRollNumber(@PathVariable("studentId") Integer studentId){
        _StudentService.deleteStudentAccountByStudentId(studentId);
        return ResponseEntity.noContent().build();
    }
}
