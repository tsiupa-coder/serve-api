package com.serve.api.repository;

import com.serve.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> get(String id);
    boolean create(User user);
    List<User> getAll();
}
