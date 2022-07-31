package com.serve.api.model;

import com.serve.api.dto.ArriveDto;
import com.serve.api.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity(name = "arrive")
public class Arrive extends BaseEntity {
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
