package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import com.serve.api.model.enumeration.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "arrive")
public class Arrive extends BaseEntity {

    Type type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "worker_id")
    Worker worker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enter_id", nullable = true)
    Arrive enter_id;

}
