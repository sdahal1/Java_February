package com.dahal.teamsplayers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dahal.teamsplayers.models.Player;


@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
