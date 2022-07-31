package com.serve.api.controler;

import com.serve.api.dto.ArriveDto;
import com.serve.api.service.ArriveService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.serve.api.controler.endpoints.Endpoints.ARRIVE;
import static com.serve.api.controler.endpoints.Endpoints.ID;

@RestController
@AllArgsConstructor
@RequestMapping(ARRIVE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ArriveController{

    ArriveService service;

    @GetMapping(ID)
    public ArriveDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<ArriveDto> get() {
        return service.get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody ArriveDto arrive) {
        service.create(arrive);
    }
}
