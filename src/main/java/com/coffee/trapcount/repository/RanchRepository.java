package com.coffee.trapcount.repository;

import com.coffee.trapcount.repository.model.RanchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RanchRepository extends CrudRepository<RanchEntity, Integer> {

    List<RanchEntity> findByName(String name);
    List<RanchEntity> findByNameLikeIgnoreCase(String name);
    List<RanchEntity> findByDescriptionLikeIgnoreCase(String description);
}
