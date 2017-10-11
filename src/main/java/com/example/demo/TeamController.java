

package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;


    @GetMapping("/teams")
    public Iterable<Team> getTeams() {   
        return teamRepository.findAll();

    }


    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }
}
