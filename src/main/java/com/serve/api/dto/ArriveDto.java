package com.serve.api.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArriveDto {
    String company_id;
    String user_token;
}
