package com.dcraven.repository;

import com.dcraven.model.StatusItem;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface StatusItemRepository extends CrudRepository<StatusItem, Long> {
}
