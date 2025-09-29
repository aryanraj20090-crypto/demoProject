package com.personal.demoProject.guardian;


import com.personal.demoProject.dto.guardian.GuardianRequestDTO;
import com.personal.demoProject.dto.guardian.GuardianResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guardian")
public class GuardianController {

    private final GuardianService _GuardianService;

    public GuardianController(GuardianService guardianService) {
        _GuardianService = guardianService;
    }


    @PostMapping("/")
    public GuardianResponseDTO createGuardianAccount(@RequestBody GuardianRequestDTO guardianRequestDTO){
        GuardianResponseDTO guardianAccount = _GuardianService.createGuardianAccount(guardianRequestDTO);
        return guardianAccount;
    }


    @GetMapping("/{id}")
    public GuardianResponseDTO getGuardiansByGuardianId(@PathVariable("/")Integer guardianId){
        GuardianResponseDTO ByGuardianId = _GuardianService.getGuardiansByGuardianId(guardianId);
        return ByGuardianId;
    }
    @GetMapping("/all")
    public List<GuardianResponseDTO> getAllGuardian(){
        List<GuardianResponseDTO> allGuardian = _GuardianService.getAllGuardian();
        return allGuardian;
    }
    @PutMapping("/{id}")
    public GuardianResponseDTO UpdateGuardianAccount(@PathVariable("id") Integer guardianId, GuardianRequestDTO guardianRequestDTO){
        GuardianResponseDTO guardianResponseDTO = _GuardianService.UpdateGuardianAccount(guardianId, guardianRequestDTO);
        return guardianResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuardianAccountByGuardianId(@PathVariable("id") Integer guardianId){
        _GuardianService.deleteGuardianAccountByGuardianId(guardianId);
        return ResponseEntity.noContent().build();
    }
}
