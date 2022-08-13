package com.serve.api.repository;

import com.serve.api.model.entity.Arrive;
import com.serve.api.model.enumeration.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArriveRepository extends JpaRepository<Arrive, Long> {

    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.limit-query-result
    Optional<Arrive> findTopByWorkerIdAndTypeOrderByCreateDateTimeDesc(Long id, Type type);

}
