package com.serve.api.controler;

import com.serve.api.dto.ArriveDto;
import com.serve.api.service.ArriveService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.jdbc.core.SqlReturnType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/arrive")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ArriveController {

//    ArriveService service;
//
//    @PostMapping
//    public boolean arrive(@RequestBody ArriveDto arriveDto) {
//        return service.arrive(arriveDto);
//    }
}
