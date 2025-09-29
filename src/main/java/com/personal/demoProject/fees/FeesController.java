package com.personal.demoProject.fees;

import com.personal.demoProject.dto.fees.FeesRequestDTO;
import com.personal.demoProject.dto.fees.FeesResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fees")
public class FeesController {

    private final FeesService _FeesService;

    public FeesController(FeesService feesService) {
        _FeesService = feesService;
    }
    @PostMapping("/")
    public FeesResponseDTO createFeesAccount (@RequestBody FeesRequestDTO feesRequestDTO){
        FeesResponseDTO feesAccount = _FeesService.createFeesAccount(feesRequestDTO);

        return feesAccount;
    }
    @GetMapping("/{id}")
    public FeesResponseDTO getByFeesId (@PathVariable("id")Integer feesId){
        FeesResponseDTO byFeesId = _FeesService.getByFeesId(feesId);
        return byFeesId;
    }
    @GetMapping("/all")
    public List<FeesResponseDTO> getAllFees(){
        List<FeesResponseDTO> allFees = _FeesService.getAllFees();
        return allFees;
    }
    @PutMapping("/{id}")
    public FeesResponseDTO updateFeesAccount (@PathVariable("id") Integer feesId, FeesRequestDTO feesRequestDTO){
        FeesResponseDTO feesResponseDTO = _FeesService.updateFeesAccount(feesId, feesRequestDTO);
        return feesResponseDTO;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFeesAccountByFeesId (@PathVariable("id") Integer feesId){
        _FeesService.deleteFeesAccountByFeesId(feesId);
        return ResponseEntity.noContent().build();
    }

}
