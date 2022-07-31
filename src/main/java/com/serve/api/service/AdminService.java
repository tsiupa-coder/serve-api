package com.serve.api.service;

import com.serve.api.dto.AdminDto;
import com.serve.api.dto.AdminPswDto;
import com.serve.api.mapper.AdminDtoMapper;
import com.serve.api.mapper.AdminPswMapper;
import com.serve.api.model.entity.Admin;
import com.serve.api.repository.AdminRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AdminService {

    AdminRepository repository;
    AdminDtoMapper mapper;
    AdminPswMapper pswMapper;

    public AdminDto get(Long id) {
        if(Objects.isNull(id)) throw new NullPointerException("Id is null");
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public List<AdminDto> get() {
        return repository.findAll().stream().map(admin -> mapper.toDto(admin)).collect(Collectors.toList());
    }

    public void create(AdminPswDto dto){
        if(Objects.isNull(dto)) throw new NullPointerException("Dto is null");
        Admin admin = pswMapper.toModel(dto);
        repository.save(admin);
    }

    public void remove(Long id){
        if(Objects.isNull(id)) throw new NullPointerException("Id is null");
        repository.deleteById(id);
    }
}
