package com.serve.api.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class WorkTime {

    long timestamp_start;
    long timestamp_end;
}
