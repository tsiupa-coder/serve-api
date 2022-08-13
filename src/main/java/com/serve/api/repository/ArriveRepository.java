package com.serve.api.repository;

import com.serve.api.model.entity.Arrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriveRepository extends JpaRepository<Arrive, Long> {

    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.limit-query-result
    Arrive findTopById(Long id);

}
