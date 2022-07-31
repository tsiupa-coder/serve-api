package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "admin")
public class Admin extends BaseEntity {
    String firstName;
    String secondName;
    String email;
    String password;
    boolean isActive;
}
