package com.personal.demoProject.fees;

import com.personal.demoProject.dto.fees.FeesRequestDTO;
import com.personal.demoProject.dto.fees.FeesResponseDTO;

import java.util.List;

public interface FeesService {
    FeesResponseDTO createFeesAccount (FeesRequestDTO feesRequestDTO);
    FeesResponseDTO getByFeesId (Integer feesId);
    List<FeesResponseDTO> getAllFees();
    FeesResponseDTO updateFeesAccount (Integer feesId, FeesRequestDTO feesRequestDTO);
    void deleteFeesAccountByFeesId (Integer feesId);
}
