package com.dcraven.repository;

import com.dcraven.model.Report;
import org.springframework.data.repository.CrudRepository;


public interface ReportRepository extends CrudRepository<Report, Long> {
}
