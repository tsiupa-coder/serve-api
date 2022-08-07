package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import com.serve.api.model.enumeration.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "arrive")
public class Arrive extends BaseEntity {

    Type type;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    Company company;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    Worker worker;

    // Link to Arrive | only for Type.exit
    long enter_id;

}
