

package com.example.demo;


import org.springframework.data.repository.CrudRepository;


//@RestResource(path = "players", rel = "players")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
