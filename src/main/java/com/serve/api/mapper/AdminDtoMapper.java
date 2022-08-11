package com.serve.api.mapper;

import com.serve.api.dto.AdminDto;
import com.serve.api.model.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminDtoMapper {

    public AdminDto toDto(Admin admin) {
        AdminDto dto = new AdminDto(admin.getFirstName(), admin.getSecondName());
        return dto;
    }

    public Admin toModel(AdminDto dto) {
        Admin admin = new Admin();
        admin.setFirstName(dto.getFirstName());
        admin.setSecondName(dto.getSecondName());
        return admin;
    }
}
