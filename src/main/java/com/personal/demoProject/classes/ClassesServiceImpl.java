package com.personal.demoProject.classes;

import com.personal.demoProject.dto.classes.ClassesRequestDTO;
import com.personal.demoProject.dto.classes.ClassesResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService{

    @Override
    public ClassesResponseDTO createClassRoom(ClassesRequestDTO classesRequestDTO) {return null;}

    @Override
    public ClassesResponseDTO getByClassName(Integer classRoom) {return null;}

    @Override
    public List<ClassesResponseDTO> getAllClassRoom() {return List.of();}

    @Override
    public ClassesResponseDTO updateClassRooms(ClassesRequestDTO classesRequestDTO) {return null;}

    @Override
    public void deleteClassRoomById(Integer id) {

    }
}
