package com.serve.api.mapper;

import com.serve.api.dto.ArriveDto;
import com.serve.api.model.entity.Arrive;
import com.serve.api.repository.ArriveRepository;
import com.serve.api.repository.CompanyRepository;
import com.serve.api.repository.WorkerRepository;
import liquibase.pro.packaged.W;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ArriveMapper {

    public ArriveDto toDto(Arrive arrive) {

        ArriveDto dto = new ArriveDto(arrive.getCompany().getId(), arrive.getWorker().getId(), arrive.getType());

        return dto;
    }

    public Arrive toModel(ArriveDto dto, CompanyRepository repository, WorkerRepository workerRepository) {

        Arrive arrive = new Arrive();
        arrive.setCompany(repository.findById(dto.getCompanyId()).get());
        arrive.setWorker(workerRepository.findById(dto.getUserId()).get());
        arrive.setType(dto.getType());
        return arrive;
    }
}
