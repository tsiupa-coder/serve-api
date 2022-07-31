package com.serve.api.service;

import com.serve.api.dto.UserDto;
import com.serve.api.mapper.UserMapper;
import com.serve.api.model.User;
import com.serve.api.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.serve.api.mapper.UserMapper.toDto;
import static com.serve.api.mapper.UserMapper.toModel;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepository repository;

    public UserDto get(Long id) {

        if(Objects.isNull(id)) throw new NullPointerException("Id is null");

        return toDto(repository.findById(id).orElseThrow());
    }

    public void create(UserDto dto) {

        if(Objects.isNull(dto)) throw new NullPointerException("User is null");
        User user = toModel(dto);

        repository.save(user);
    }

    public List<UserDto> getAll(){

        List<UserDto> dtos = repository.findAll().stream().map(UserMapper::toDto).collect(Collectors.toList());

        return dtos;
    }
}
