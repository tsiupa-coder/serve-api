package com.serve.api.model;

import com.serve.api.dto.UserDto;
import com.serve.api.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "users")
public class User extends BaseEntity {

    @Column(name = "firstname")
    String first_name;
    @Column(name = "secondname")
    String second_name;
    @Column(name = "position")
    String position;

    public static User getUser(UserDto userDto) {

        User user = new User();
        user.setFirst_name(userDto.getFirst_name());
        user.setSecond_name(user.getSecond_name());
        user.setPosition(user.getPosition());

        return user;
    }

    public UserDto getDto() {

        UserDto userDto = new UserDto(this.getFirst_name(), this.getSecond_name(), this.getPosition());
        return userDto;
    }
}
