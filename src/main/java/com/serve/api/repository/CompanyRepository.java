package com.serve.api.repository;

import com.serve.api.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

//    public Optional<Company> get(String id);
//    public List<Company> get();
}
