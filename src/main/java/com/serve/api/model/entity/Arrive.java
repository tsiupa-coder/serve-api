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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "companyId")
    Company company;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "workerId")
    Worker worker;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "enterId", nullable = true)
    Arrive enterId;

}
