package com.serve.api.mapper;

import com.serve.api.dto.UserDto;
import com.serve.api.model.User;

import java.util.Objects;

public class UserMapper {

    public static UserDto toDto(User user){

        if(Objects.isNull(user)) throw new NullPointerException("User is null");
        return new UserDto(user.getFirst_name(), user.getSecond_name(), user.getPosition());
    }

    public static User toModel(UserDto dto){

        if(Objects.isNull(dto)) throw new NullPointerException("Dto is null");

        User user = new User();
        user.setFirst_name(dto.getFirst_name());
        user.setSecond_name(dto.getSecond_name());
        user.setPosition(dto.getPosition());

        return user;
    }

}

