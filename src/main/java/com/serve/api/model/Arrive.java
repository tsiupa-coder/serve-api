package com.serve.api.model;

import com.serve.api.dto.ArriveDto;
import com.serve.api.dto.UserDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
public class Arrive {
    String company_id;
    String user_token;
    Type type;

    public ArriveDto toDto() {

        ArriveDto dto = new ArriveDto(this.company_id, this.user_token, this.type);

        return dto;
    }

    public static Arrive getArrive(ArriveDto dto) {

        Arrive arrive = new Arrive(dto.getCompany_id(), dto.getUser_token(), dto.getType());

        return arrive;
    }
}
