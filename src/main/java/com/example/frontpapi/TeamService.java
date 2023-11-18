package com.example.frontpapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TeamService {
    private List<Team> teams =new ArrayList<>();

    public void addTeam(Team druzyna)
    {
        teams.add(druzyna);
    }

    public List<Team> getTeam(){
        return teams;
    }


}
