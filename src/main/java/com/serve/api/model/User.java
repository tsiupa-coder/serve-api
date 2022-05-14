package com.serve.api.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {

    private String first_name;
    private String second_name;
    private String position;
    private ArrayList<WorkTime> works;
    private Company company;

}
