package com.personal.demoProject.fees;

import com.personal.demoProject.dto.fees.FeesRequestDTO;
import com.personal.demoProject.dto.fees.FeesResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeesServiceImpl implements FeesService {

    @Override
    public FeesResponseDTO createFeesAccount(FeesRequestDTO feesRequestDTO) {return null;}

    @Override
    public FeesResponseDTO getByFeesId(Integer feesId) {return null;}

    @Override
    public List<FeesResponseDTO> getAllFees() {return List.of();}

    @Override
    public FeesResponseDTO updateFeesAccount(FeesRequestDTO feesRequestDTO) {return null;}

    @Override
    public void deleteFeesAccountByFeesId(Integer feesId) {

    }
}
