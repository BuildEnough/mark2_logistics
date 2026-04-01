package com.buildenough.logistics.partner;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartnerDto {
    private Integer partnerId;
    private String partnerCode;
    private String partnerName;
    private String partnerType;
    private String managerName;
    private String phone;
    private String address;
    private String useYn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
