package com.serve.api.service;

import com.serve.api.dto.WorkerDto;
import com.serve.api.mapper.WorkerMapper;
import com.serve.api.model.entity.Worker;
import com.serve.api.repository.WorkerRepository;
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
public class WorkerService {

    WorkerRepository repository;
    WorkerMapper mapper;

    public WorkerDto get(Long id) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");

        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public void create(WorkerDto dto) {

        if (Objects.isNull(dto)) throw new NullPointerException("User is null");
        Worker user = mapper.toModel(dto);

        repository.save(user);
    }

    public List<WorkerDto> getAll() {

        List<WorkerDto> dtos = repository.findAll().stream().map(user -> mapper.toDto(user)).collect(Collectors.toList());

        return dtos;
    }

    public void update(Long id, String position) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");
        if (Objects.isNull(position) || position.isBlank()) throw new NullPointerException("position is null");

        Worker worker = repository.findById(id).orElseThrow();
        worker.setPosition(position);

        repository.save(worker);
    }

    public void remove(Long id) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");

        repository.deleteById(id);
    }
}
