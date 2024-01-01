package com.DbJpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.DbJpa.entity.Player;
//@Repository   =>It is optional here because our interface is not a normal interface,our interface is extending the
//properties from CrudRepository
public interface PlayerRepository extends CrudRepository<Player, Integer>{

}
