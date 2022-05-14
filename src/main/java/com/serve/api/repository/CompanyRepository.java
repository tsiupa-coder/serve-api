package com.serve.api.repository;

import com.serve.api.model.Company;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository {

    public Optional<Company> get(String id);
    public List<Company> get();
    public boolean create(Company company);
}
