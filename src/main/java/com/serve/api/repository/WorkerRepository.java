package com.serve.api.repository;

import com.serve.api.model.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

    Worker getByEmail(String email);
}
