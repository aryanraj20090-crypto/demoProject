package com.personal.demoProject.guardian;

import com.personal.demoProject.dto.guardian.GuardianRequestDTO;
import com.personal.demoProject.dto.guardian.GuardianResponseDTO;

import java.util.List;

public interface GuardianService {
    GuardianResponseDTO createGuardianAccount (GuardianRequestDTO guardianRequestDTO);
    GuardianResponseDTO getGuardiansByGuardianId(Integer guardianId);
    List<GuardianResponseDTO> getAllGuardian();
    GuardianResponseDTO UpdateGuardianAccount(Integer guardianId, GuardianRequestDTO guardianRequestDTO);
    void deleteGuardianAccountByGuardianId(Integer guardianId);
}
