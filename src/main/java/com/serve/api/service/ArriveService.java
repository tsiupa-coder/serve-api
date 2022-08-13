package com.serve.api.service;

import com.serve.api.dto.ArriveDto;
import com.serve.api.mapper.ArriveMapper;
import com.serve.api.model.entity.Arrive;
import com.serve.api.model.enumeration.Type;
import com.serve.api.repository.ArriveRepository;
import com.serve.api.repository.CompanyRepository;
import com.serve.api.repository.WorkerRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    CompanyRepository companyRepository;
    WorkerRepository workerRepository;
    ArriveMapper mapper;

    Logger logger = LoggerFactory.getLogger(ArriveService.class);

    public ArriveDto get(Long id) {

        logger.info("Get Arrive by id" + id);

        if (Objects.isNull(id)) {
            logger.warn("Id is null");
            throw new IllegalArgumentException("Id is null");
        }
        return mapper.toDto(repository.getById(id));
    }

    public void create(ArriveDto dto) {

        if (Objects.isNull(dto)) throw new IllegalArgumentException("Arrive dto is null");

        Arrive arrive = mapper.toModel(dto, companyRepository, workerRepository);

        if(arrive.getType() == Type.Exit) {

            Arrive fake = new Arrive();
            fake.setId(null);

            Arrive lastEnter = repository
                    .findAll()
                    .stream()
                    .filter(entity -> Objects.equals(entity.getType(), Type.Enter))
                    .reduce((first, second) -> second)
                    .orElse(fake);

            arrive.setId(lastEnter.getId());
        }

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

        if (Objects.isNull(id)) throw new IllegalArgumentException("Id is null");
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

    public Arrive getLatOne(Long id){
        return repository.findTopById(id);
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

    public long getSeconds(Long workerId, Period period){

        //якщо кількість входів != кількості виходів  == помилка
        // вихід - вхід = робоічі години
        // загальні += робочі години
        // return загальні - кількість входів * робочий день(години)


        // TODO: 07.08.22 первести фільтрацію на базу даних (так знімітся навантаження з апки)
        // TODO: 07.08.22 зробити фільтафію за періодом

        long totalTimeInSeconds = 0;

        List<Arrive> exit = repository
                .findAll()
                .stream()
                .filter(arrive -> Objects.equals(arrive.getType(), Type.Exit))
                .filter(arrive -> Objects.nonNull(arrive.getEnter_id()))
                .collect(Collectors.toList());

//        for (Arrive arrive : exit){
//            Arrive enter = repository
//                    .findById(arrive.getEnter_id())
//                    .orElseThrow();
//            Duration duration = Duration
//                    .between(enter.getCreateDateTime(), arrive.getCreateDateTime());
//            totalTimeInSeconds += duration.getSeconds();
//        }

        return totalTimeInSeconds;
    }



}
