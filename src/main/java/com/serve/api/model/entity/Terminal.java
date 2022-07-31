package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "terminal")
public class Terminal extends BaseEntity {

    String name;
    String location;
    String description;
}
