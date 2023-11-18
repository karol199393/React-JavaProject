package com.example.frontpapi;

public class Match {
    private Long id;
    private Team teamA;
    private Team teamB;
    private int resultTeamA;
    private int resultTeamB;

    private Long getId()
    {
        return id;
    }
    private void setTeamA(Team druzynaA)
    {
        this.teamA =druzynaA;
    }
    private void setTeamB(Team druzynaB)
    {
        this.teamB =druzynaB;
    }

    private int getResultTeamA(){
        return resultTeamA;
    }
    private int getResultTeamB(){
        return resultTeamB;
    }


}
