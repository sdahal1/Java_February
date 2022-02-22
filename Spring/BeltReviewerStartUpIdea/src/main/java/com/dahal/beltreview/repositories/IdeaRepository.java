package com.dahal.beltreview.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dahal.beltreview.models.Idea;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long> {

}
