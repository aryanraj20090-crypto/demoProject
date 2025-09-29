package com.personal.demoProject.classes;


import com.personal.demoProject.dto.classes.ClassesRequestDTO;
import com.personal.demoProject.dto.classes.ClassesResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {


    private final ClassesService _ClassesService;

    public ClassesController(ClassesService classesService) {
        _ClassesService = classesService;
    }

    @PostMapping("/")
    public ClassesResponseDTO createClassRoom (@RequestBody ClassesRequestDTO classesRequestDTO){

        ClassesResponseDTO classRoom = _ClassesService.createClassRoom(classesRequestDTO);

        return classRoom;
    }
    @GetMapping("/{id}")
    public ClassesResponseDTO getByClassName(@PathVariable ("id") Integer classRoom){
        ClassesResponseDTO classesResponseDTO = _ClassesService.getByClassName(classRoom);
        return classesResponseDTO;
    }
    @GetMapping("/all")
    public List<ClassesResponseDTO> getAllClassRoom(){
        List<ClassesResponseDTO> allClassRoom = _ClassesService.getAllClassRoom();
        return allClassRoom;
    }
    @PutMapping("/{id}")
    public ClassesResponseDTO updateClassRooms (@PathVariable("id") Integer classId, ClassesRequestDTO classesRequestDTO){
        ClassesResponseDTO classesResponseDTO = _ClassesService.updateClassRooms(classId, classesRequestDTO);
        return classesResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassId(@PathVariable("id") Integer classId){
        _ClassesService.deleteClassId(classId);
        return ResponseEntity.noContent().build();
    }
}
