package com.serve.api.service;

import com.serve.api.model.entity.Arrive;
import com.serve.api.model.enumeration.Type;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Helper {


    public Integer calculate(List<Arrive> userArrive){

//        List<Arrive> enter = userArrive.stream().filter(arrive -> arrive.getType() == Type.Enter).collect(Collectors.toList());
//        List<Arrive> exit = userArrive.stream().filter(arrive -> arrive.getType() == Type.Exit).collect(Collectors.toList());


        Arrive arrive = new Arrive();
        arrive.getCreateDateTime().toLocalDate();


        return null;
    }

}
