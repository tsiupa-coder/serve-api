package com.serve.api.dto;

import com.serve.api.model.Type;
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
    Type type;
}
