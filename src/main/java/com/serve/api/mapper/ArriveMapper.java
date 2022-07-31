package com.serve.api.mapper;

import com.serve.api.dto.ArriveDto;
import com.serve.api.model.Arrive;
import org.springframework.stereotype.Service;

@Service
public class ArriveMapper {

    public ArriveDto toDto(Arrive arrive) {

        ArriveDto dto = new ArriveDto(arrive.getCompanyId(), arrive.getUserId(), arrive.getType());

        return dto;
    }

    public Arrive toModel(ArriveDto dto) {

        Arrive arrive = new Arrive();
        arrive.setCompanyId(dto.getCompanyId());
        arrive.setUserId(dto.getUserId());
        arrive.setType(dto.getType());
        return arrive;
    }
}
