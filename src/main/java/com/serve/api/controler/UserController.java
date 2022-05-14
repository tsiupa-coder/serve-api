package com.serve.api.controler;

import com.serve.api.dto.UserDto;
import com.serve.api.model.User;
import com.serve.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService service;

    @GetMapping("{id}")
    public UserDto getUser(@PathVariable String id) {


        return service.get(id);
    }

    @PostMapping
    public boolean create(@RequestBody UserDto user) {

        return service.create(user);
    }

    @GetMapping
    public List<UserDto> get(){

        return service.getAll();
    }
}
