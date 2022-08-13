package com.serve.api.controler;

import com.serve.api.dto.CompanyDto;
import com.serve.api.service.CompanyService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.serve.api.controler.endpoints.Endpoints.COMPANY;
import static com.serve.api.controler.endpoints.Endpoints.ID;

// TODO: 13.08.22 змінити оновленння дескріпшін через боді

@RestController
@AllArgsConstructor
@RequestMapping(COMPANY)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanyController {

    CompanyService service;

    @GetMapping(ID)
    public CompanyDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<CompanyDto> get() {
        return service.get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody CompanyDto company) {
        service.create(company);
    }

    @PutMapping(ID)
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void update(@PathVariable Long id, @RequestParam String description) {
        service.update(id, description);
    }

    @DeleteMapping(ID)
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        service.remove(id);
    }
}
