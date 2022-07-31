package com.serve.api.repository;

import com.serve.api.model.Arrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriveRepository extends JpaRepository<Arrive, Long> {

}
