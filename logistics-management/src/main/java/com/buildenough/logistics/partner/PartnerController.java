package com.buildenough.logistics.partner;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/partners")
public class PartnerController {

    private final PartnerService partnerService;

    @GetMapping
    public List<PartnerDto> getPartners() {
        return partnerService.getPartners();
    }

    @GetMapping("/all")
    public List<PartnerDto> getAllPartners() {
        return partnerService.getAllPartners();
    }
}
