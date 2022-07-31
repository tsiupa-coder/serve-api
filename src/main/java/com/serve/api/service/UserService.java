package com.serve.api.service;

import com.serve.api.dto.UserDto;
import com.serve.api.mapper.UserMapper;
import com.serve.api.model.entity.User;
import com.serve.api.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepository repository;
    UserMapper mapper;

    public UserDto get(Long id) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");

        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public void create(UserDto dto) {

        if (Objects.isNull(dto)) throw new NullPointerException("User is null");
        User user = mapper.toModel(dto);

        repository.save(user);
    }

    public List<UserDto> getAll() {

        List<UserDto> dtos = repository.findAll().stream().map(user -> mapper.toDto(user)).collect(Collectors.toList());

        return dtos;
    }

    public void update(Long id, String position) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");
        if (Objects.isNull(position) || position.isBlank()) throw new NullPointerException("position is null");

        User user = repository.findById(id).orElseThrow();
        user.setPosition(position);

        repository.save(user);
    }

    public void remove(Long id) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");

        repository.deleteById(id);
    }
}
