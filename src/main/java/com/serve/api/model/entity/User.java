package com.serve.api.model.entity;

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
}
