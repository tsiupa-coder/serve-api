package com.serve.api.service;

import com.serve.api.dto.ArriveDto;
import com.serve.api.mapper.ArriveMapper;
import com.serve.api.model.entity.Arrive;
import com.serve.api.model.enumeration.Type;
import com.serve.api.repository.ArriveRepository;
import liquibase.exception.DatabaseException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ArriveService {

    ArriveRepository repository;
    ArriveMapper mapper;

    public ArriveDto get(Long id) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");

        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public void create(ArriveDto dto) {

        if (Objects.isNull(dto)) throw new NullPointerException("Arrive dto is null");

        Arrive arrive = mapper.toModel(dto);
        repository.save(arrive);
    }

    public List<ArriveDto> get() {

        return repository
                .findAll()
                .stream()
                .map(arrive -> mapper.toDto(arrive))
                .collect(Collectors.toList());
    }

    public void remove(Long id) {

        if (Objects.isNull(id)) throw new NullPointerException("Id is null");
        repository.deleteById(id);
    }

    /**
     *  тут потрібно реалізувати функціонал
     *
     *  щоб поверталися години для працівника
     *
     *  за певною датою
     *
     */
    public int getHours(Long workerId, Date date){

        return 0;
    }


    public int getHours(Long workerId, Date start, Date end) {


        return 0;
    }


    /***
     * повертаються години
     *
     * при чому одного типу (вхід, вихід)
     *
     * За певний період
     */
    public int getHours(Long userId, Period period, Type type){


        return 0;
    }

    public int getHours(Long workerId, Period period){

        //якщо кількість входів != кількості виходів  == помилка
        // вихід - вхід = робоічі години
        // загальні += робочі години
        // return загальні - кількість входів * робочий день(години)



        return 0;
    }



}
