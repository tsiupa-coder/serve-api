package com.serve.api.controler;

import com.serve.api.dto.CompanyDto;
import com.serve.api.model.Company;
import com.serve.api.service.CompanyService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanyController {

    CompanyService service;

    @GetMapping("{id}")
    public CompanyDto get(String id) {
        return service.get(id);
    }
    @GetMapping
    public List<CompanyDto> get() {
        return service.get();
    }
    @PostMapping
    public boolean create(@RequestBody CompanyDto company) {
        return service.create(company);
    }
}
