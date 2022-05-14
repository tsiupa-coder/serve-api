package com.serve.api.model;

import com.serve.api.dto.CompanyDto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Company {

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
