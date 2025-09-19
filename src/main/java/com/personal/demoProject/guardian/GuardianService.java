package com.personal.demoProject.guardian;

import com.personal.demoProject.dto.guardian.GuardianRequestDTO;
import com.personal.demoProject.dto.guardian.GuardianResponseDTO;

import java.util.List;

public interface GuardianService {
    GuardianResponseDTO createGuardianAccount (GuardianRequestDTO guardianRequestDTO);
    GuardianResponseDTO getGuardiansByName (String guardian);
    List<GuardianResponseDTO> getAllGuardian();
    GuardianResponseDTO UpdateGuardianAccount(GuardianRequestDTO guardianRequestDTO);
    void deleteGuardianAccountByGuardianName (String guardian);
}
