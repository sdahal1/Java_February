package com.dahal.teamsplayers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dahal.teamsplayers.models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

}
