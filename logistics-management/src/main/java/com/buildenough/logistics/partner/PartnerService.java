package com.buildenough.logistics.partner;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartnerService {
    private final PartnerMapper partnerMapper;

    public List<PartnerDto> getPartners() {
        return partnerMapper.findActivePartners();
    }

    public List<PartnerDto> getAllPartners() {
        return partnerMapper.findAllPartners();
    }
}
