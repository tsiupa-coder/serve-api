package com.serve.api.service;

import com.serve.api.dto.TerminalDto;
import com.serve.api.mapper.TerminalMapper;
import com.serve.api.model.entity.Terminal;
import com.serve.api.repository.TerminalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TerminalService {

    TerminalRepository repository;
    TerminalMapper mapper;

    public TerminalDto get(Long id) {
        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");
        return mapper.toDto(repository.getById(id));
    }

    public List<TerminalDto> get() {
        return repository
                .findAll()
                .stream()
                .map(terminal -> mapper.toDto(terminal))
                .collect(Collectors.toList());
    }


    public void create(TerminalDto dto) {

        Terminal terminal = mapper.toModel(dto);

        repository.save(terminal);
    }

    public void remove(Long id) {

        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");

        repository.deleteById(id);
    }

    public void update(Long id, TerminalDto dto) {

        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");
        if (Objects.isNull(dto)) throw new IllegalArgumentException("Dto is null");

        Terminal terminal = repository.findById(id).orElseThrow();

        terminal = mapper.update(terminal, mapper.toModel(dto));

        repository.save(terminal);
    }

}
