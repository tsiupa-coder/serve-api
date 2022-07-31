package com.serve.api.model;

import com.serve.api.dto.CompanyDto;
import com.serve.api.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity(name = "company")
public class Company extends BaseEntity {

    String name;
    String description;
    String token;

    public static Company getCompany(CompanyDto company){

        Company company1 = new Company();
        company1.setName(company.getName());
        company1.setDescription(company.getDescription());

        return company1;
    }

    public CompanyDto toDto(){

        CompanyDto dto = new CompanyDto(this.name, this.getDescription());

        return dto;
    }
}
