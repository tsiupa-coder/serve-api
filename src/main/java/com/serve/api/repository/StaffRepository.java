package com.serve.api.repository;

import com.serve.api.model.document.Staff;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends ElasticsearchRepository<Staff, Long> {
}
