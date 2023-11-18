package com.example.frontpapi;

import com.example.frontpapi.Team;
import com.example.frontpapi.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/addTeam")
    public int addTeam(@RequestBody Team team) {
        teamService.addTeam(team);
        return HttpStatus.CREATED.value();
    }

    @GetMapping("/getTeams")
    public List<Team> getTeams() {
        return teamService.getTeam();
    }
}
