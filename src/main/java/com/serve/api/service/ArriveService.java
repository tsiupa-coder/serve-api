package com.serve.api.service;

import com.serve.api.dto.ArriveDto;
import com.serve.api.dto.CompanyDto;
import com.serve.api.mapper.ArriveMapper;
import com.serve.api.model.Arrive;
import com.serve.api.repository.ArriveRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ArriveService {

    ArriveRepository repository;
    ArriveMapper mapper;

    public ArriveDto get(Long id) {

        if(Objects.isNull(id)) throw new NullPointerException("Id is null");

        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public void create(ArriveDto dto) {

        if(Objects.isNull(dto)) throw new NullPointerException("Arrive dto is null");

        Arrive arrive = mapper.toModel(dto);
        repository.save(arrive);
    }

    public List<ArriveDto> get(){

        return repository
                .findAll()
                .stream()
                .map(arrive -> mapper.toDto(arrive))
                .collect(Collectors.toList());
    }
}
