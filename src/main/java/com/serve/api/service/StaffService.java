package com.serve.api.service;

import com.serve.api.model.document.Staff;
import com.serve.api.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository repository;

    @Autowired
    public StaffService(StaffRepository repository) {
        this.repository = repository;
    }

    public void save(final Staff staff){
        repository.save(staff);
    }

    public Staff findById(final Long id){
        return repository.findById(id).orElse(null);
    }
}
