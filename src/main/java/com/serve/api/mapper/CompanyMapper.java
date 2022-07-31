package com.serve.api.mapper;

import com.serve.api.dto.CompanyDto;
import com.serve.api.model.entity.Company;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CompanyMapper {

    public CompanyDto toDto(Company company) {

        if (Objects.isNull(company)) throw new NullPointerException("Company is null");
        return new CompanyDto(company.getName(), company.getDescription());
    }

    public Company toModel(CompanyDto dto) {

        if (Objects.isNull(dto)) throw new NullPointerException("Dto is null");

        Company company = new Company();

        company.setName(dto.getName());
        company.setDescription(dto.getDescription());

        return company;
    }
}
