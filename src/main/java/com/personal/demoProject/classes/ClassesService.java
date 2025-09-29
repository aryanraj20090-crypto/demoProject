package com.personal.demoProject.classes;

import com.personal.demoProject.dto.classes.ClassesRequestDTO;
import com.personal.demoProject.dto.classes.ClassesResponseDTO;

import java.util.List;

public interface ClassesService {
    ClassesResponseDTO createClassRoom (ClassesRequestDTO classesRequestDTO);
    ClassesResponseDTO getByClassName (Integer classRoom);
    List<ClassesResponseDTO> getAllClassRoom ();
    ClassesResponseDTO updateClassRooms (Integer classId, ClassesRequestDTO classesRequestDTO);
    void deleteClassId(Integer classId);
}
