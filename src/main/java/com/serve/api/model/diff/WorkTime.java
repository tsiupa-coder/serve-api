package com.serve.api.model.diff;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkTime {

    long timestamp_start;
    long timestamp_end;
}
