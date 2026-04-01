package com.buildenough.logistics.partner;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartnerMapper {
    List<PartnerDto> findActivePartners();
    List<PartnerDto> findAllPartners();
}
