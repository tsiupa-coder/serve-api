package com.serve.api.security;

import com.serve.api.model.entity.Worker;
import com.serve.api.repository.WorkerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Service
public class UserService implements UserDetailsService {

    private WorkerRepository repository;

    public UserService(WorkerRepository repository) {
        this.repository = repository;
    }

    public List<Worker> getAll() {
        return this.repository.findAll();
    }

    public Worker getByEmail(String email) {
        return this.repository.getByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Worker u = getByEmail(login);
        if (Objects.isNull(u)) {
            throw new UsernameNotFoundException(String.format("User %s is not found", login));
        }
        return new org.springframework.security.core.userdetails.User(u.getEmail(), u.getPassword(), true, true, true, true, new HashSet<>());
    }
}