package com.serve.api.repository;

import com.serve.api.model.Arrive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriveRepository extends CrudRepository<Arrive, Long>{

}
