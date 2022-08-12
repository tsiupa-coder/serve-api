package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import com.serve.api.model.enumeration.Position;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


// TODO: 12.08.22 dataBase drop table ADMIN , and WORKER
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "worker")
public class Worker extends BaseEntity {

    @Column(name = "firstname")
    String first_name;

    @Column(name = "secondname")
    String second_name;

    @Column(name = "position")
    Position position;

    @Column(name = "isActive")
    boolean isActive;

    @Column(name = "password")
    String password;

    @Column(name = "email")
    String email;
}
