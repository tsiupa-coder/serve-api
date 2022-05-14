package com.serve.api.model;

import com.serve.api.dto.UserDto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {

    String first_name;
    String second_name;
    String position;
    ArrayList<WorkTime> works;
    Company company;

    public static User getUser(UserDto userDto) {

        User user = new User();
        user.setFirst_name(userDto.getFirst_name());
        user.setSecond_name(user.getSecond_name());
        user.setPosition(user.getPosition());
        Company companyUser = new Company();
        companyUser.setName(userDto.getCompanyname());
        user.setCompany(companyUser);

        return user;
    }

    public UserDto getDto() {

        UserDto userDto = new UserDto(this.getFirst_name(), this.getSecond_name(), this.getPosition(), this.getCompany().getName());
        return userDto;
    }
}
