package com.serve.api.model.entity;

import com.serve.api.dto.CompanyDto;
import com.serve.api.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "company")
public class Company extends BaseEntity {

    String name;
    String description;
    String token;
}
