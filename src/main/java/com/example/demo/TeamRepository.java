

package com.example.demo;


import org.springframework.data.repository.CrudRepository;


//@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {

}
