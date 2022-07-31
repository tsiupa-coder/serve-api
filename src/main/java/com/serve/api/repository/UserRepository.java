package com.serve.api.repository;

import com.serve.api.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    Optional<User> get(String id);
//    boolean create(User user);
//    List<User> getAll();
}
