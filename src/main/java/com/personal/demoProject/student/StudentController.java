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

    @GetMapping("/{rollNumber}")
    public StudentResponseDTO getStudentAccountByRollNumber(@PathVariable ("rollNumber") Integer rollNumber){

        StudentResponseDTO studentByRollNumber = _StudentService.getStudentByRollNumber(rollNumber);

        return studentByRollNumber;
    }

    @GetMapping("/all")
    public List<StudentResponseDTO> gstAllStudent(){
        List<StudentResponseDTO> allStudent = _StudentService.getAllStudent();
        return allStudent;
    }
    @PutMapping("/{rollNumber}")
    public StudentResponseDTO updateStudentAccount(@PathVariable("rollNumber") Integer rollNumber, StudentRequestDTO studentRequestDTO){
        StudentResponseDTO studentResponseDTO = _StudentService.updateStudentAccount(rollNumber, studentRequestDTO);
        return studentResponseDTO;
    }

    @DeleteMapping("/{rollNumber}")
    public ResponseEntity<Void> deleteStudentAccountByRollNumber(@PathVariable("rollNumber") Integer rollNumber){
        _StudentService.deleteStudentAccountByRollNumber(rollNumber);
        return ResponseEntity.noContent().build();
    }
}
