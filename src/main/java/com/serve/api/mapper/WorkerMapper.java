package com.serve.api.mapper;

import com.serve.api.dto.WorkerDto;
import com.serve.api.model.entity.Worker;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class WorkerMapper {

    public WorkerDto toDto(Worker worker) {

        if (Objects.isNull(worker)) throw new NullPointerException("User is null");
        return new WorkerDto(worker.getFirst_name(), worker.getSecond_name(), worker.getPosition());
    }

    public Worker toModel(WorkerDto dto) {

        if (Objects.isNull(dto)) throw new NullPointerException("Dto is null");

        Worker worker = new Worker();
        worker.setFirst_name(dto.getFirst_name());
        worker.setSecond_name(dto.getSecond_name());
        worker.setPosition(dto.getPosition());

        return worker;
    }

}

