package com.serve.api.service;

import com.serve.api.dto.CompanyDto;
import com.serve.api.model.Company;
import com.serve.api.model.User;
import com.serve.api.repository.CompanyRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanyService {

    CompanyRepository repository;

    public CompanyDto get(String id) {

        return repository.get(id).orElseThrow().toDto();
    }

    public List<CompanyDto> get(){
        return repository.get().stream().map(Company::toDto).collect(Collectors.toList());
    }

    public boolean create(CompanyDto company) {

        return repository.create(Company.getCompany(company));
    }
}
