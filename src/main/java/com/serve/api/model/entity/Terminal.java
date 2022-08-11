package com.serve.api.model.entity;

import com.serve.api.model.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity(name = "terminal")
public class Terminal extends BaseEntity {

    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String location;
    @Column(nullable = false)
    String description;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = true)
    Company company;
}
