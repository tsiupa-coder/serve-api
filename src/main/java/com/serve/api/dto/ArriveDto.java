package com.serve.api.dto;

import com.serve.api.model.enumeration.Type;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArriveDto {
    Long companyId;
    Long userId;
    Type type;
}
