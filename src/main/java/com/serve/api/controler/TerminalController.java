package com.serve.api.controler;

import com.serve.api.dto.TerminalDto;
import com.serve.api.service.TerminalService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static com.serve.api.controler.endpoints.Endpoints.ID;
import static com.serve.api.controler.endpoints.Endpoints.TERMINAL;

@Controller
@AllArgsConstructor
@RequestMapping(TERMINAL)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TerminalController {

    TerminalService service;

    @GetMapping(ID)
    public TerminalDto get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<TerminalDto> get(){
        return service.get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody TerminalDto dto){
        service.create(dto);
    }

    @DeleteMapping(ID)
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.remove(id);
    }

    @PutMapping(ID)
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void update(@PathVariable Long id, @RequestBody TerminalDto dto){
        service.update(id, dto);
    }
}
