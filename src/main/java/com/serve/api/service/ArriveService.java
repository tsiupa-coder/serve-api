package com.serve.api.service;

import com.serve.api.dto.ArriveDto;
import com.serve.api.model.Arrive;
import com.serve.api.repository.ArriveRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ArriveService {

//    ArriveRepository repository;
//
//    public boolean arrive(ArriveDto arriveDto) {
//
//        return repository.arrive(Arrive.getArrive(arriveDto));
//
//    }
}
