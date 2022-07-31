package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import com.serve.api.model.enumeration.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "arrive")
public class Arrive extends BaseEntity {
    String companyId;
    String userId;
    Type type;
}
