package com.serve.api.mapper;

import com.serve.api.dto.TerminalDto;
import com.serve.api.model.entity.Terminal;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TerminalMapper {

    public TerminalDto toDto(Terminal terminal) {
        if (Objects.isNull(terminal)) throw new NullPointerException("Terminal is null");
        return new TerminalDto(terminal.getName(), terminal.getLocation(), terminal.getLocation());
    }

    public Terminal toModel(TerminalDto dto) {

        if (Objects.isNull(dto)) throw new NullPointerException("Dto is null");

        Terminal terminal = new Terminal();
        terminal.setName(dto.getName());
        terminal.setLocation(dto.getLocation());
        terminal.setDescription(dto.getDescription());

        return terminal;
    }

    public Terminal update(Terminal updated, Terminal terminal) {

        if (Objects.isNull(terminal)) throw new NullPointerException("Terminal is null");

        if (Objects.nonNull(terminal.getName())) updated.setName(terminal.getName());
        if (Objects.nonNull(terminal.getLocation())) updated.setLocation(terminal.getLocation());
        if (Objects.nonNull(terminal.getDescription())) updated.setDescription(terminal.getDescription());

        return terminal;
    }
}
