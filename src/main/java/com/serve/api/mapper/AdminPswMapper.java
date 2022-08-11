package com.serve.api.mapper;

import com.serve.api.dto.AdminPswDto;
import com.serve.api.model.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminPswMapper {

    public AdminPswDto toDto(Admin admin) {
        AdminPswDto dto = new AdminPswDto(admin.getFirstName(), admin.getSecondName(), admin.getEmail(), admin.getPassword());
        return dto;
    }

    public Admin toModel(AdminPswDto dto) {
        Admin admin = new Admin();
        admin.setFirstName(dto.getFirstName());
        admin.setSecondName(dto.getSecondName());
        admin.setEmail(dto.getEmail());
        admin.setPassword(dto.getPassword());
        return admin;
    }
}
