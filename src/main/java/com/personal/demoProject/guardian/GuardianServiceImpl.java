package com.personal.demoProject.guardian;

import com.personal.demoProject.dto.guardian.GuardianRequestDTO;
import com.personal.demoProject.dto.guardian.GuardianResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuardianServiceImpl implements GuardianService{

    @Override
    public GuardianResponseDTO createGuardianAccount(GuardianRequestDTO guardianRequestDTO) {return null;}

    @Override
    public GuardianResponseDTO getGuardiansByName(String guardian) {return null;}

    @Override
    public List<GuardianResponseDTO> getAllGuardian() {return List.of();}

    @Override
    public GuardianResponseDTO UpdateGuardianAccount(GuardianRequestDTO guardianRequestDTO) {return null;}

    @Override
    public void deleteGuardianAccountByGuardianName(String guardian) {

    }
}
