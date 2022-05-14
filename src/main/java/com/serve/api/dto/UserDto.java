package com.serve.api.dto;

import com.serve.api.model.Company;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
public class UserDto {

    String first_name;
    String second_name;
    String position;
    String companyname;
}
