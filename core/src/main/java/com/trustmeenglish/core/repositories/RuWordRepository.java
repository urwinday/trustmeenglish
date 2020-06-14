package com.trustmeenglish.core.repositories;

import com.trustmeenglish.core.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuWordRepository extends CrudRepository<EnWord, Long> {
    EnWord getById(Long id);
}
