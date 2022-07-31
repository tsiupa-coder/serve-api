package com.serve.api.controler;

import com.serve.api.dto.CompanyDto;
import com.serve.api.model.Company;
import com.serve.api.service.CompanyService;
import liquibase.pro.packaged.L;
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

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanyController {

    CompanyService service;

    @GetMapping("{id}")
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
}
