package com.serve.api.dto;

import com.serve.api.model.enumeration.Position;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class WorkerDto {

    String first_name;
    String second_name;
    Position position;
}
