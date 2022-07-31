package com.serve.api.service;

import com.serve.api.dto.UserDto;
import com.serve.api.model.User;
import com.serve.api.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepository repository;

    public UserDto get(Long id) {

        return null;
    }

    public boolean create(UserDto user) {


        return false;
    }

    public List<UserDto> getAll(){

        return null;
    }
}
