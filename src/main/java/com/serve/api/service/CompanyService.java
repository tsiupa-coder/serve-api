package com.serve.api.service;

import com.serve.api.dto.CompanyDto;
import com.serve.api.mapper.CompanyMapper;
import com.serve.api.model.entity.Company;
import com.serve.api.repository.CompanyRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanyService {

    CompanyRepository repository;
    CompanyMapper mapper;

    public CompanyDto get(Long id) {

        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");
        return mapper.toDto(repository.getById(id));
    }

    public List<CompanyDto> get() {

        List<CompanyDto> dtos = repository.findAll().stream().map(company -> mapper.toDto(company)).collect(Collectors.toList());

        return dtos;
    }

    public void create(CompanyDto dto) {

        Company company = mapper.toModel(dto);
        repository.save(company);
    }

    public void remove(Long id) {

        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");

        repository.deleteById(id);
    }

    public void update(Long id, String description) {

        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");
        if (Objects.isNull(description) || description.isBlank()) throw new IllegalArgumentException("Description is null");

        Company company = repository.findById(id).orElseThrow();
        company.setDescription(description);

        repository.save(company);
    }
}
