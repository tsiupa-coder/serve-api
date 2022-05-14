package com.serve.api.repository;

import com.serve.api.model.Arrive;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriveRepository {

    public boolean arrive(Arrive arrive);
}
