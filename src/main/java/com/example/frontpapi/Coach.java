package com.example.frontpapi;

public class Coach {
    private Long id;
    private String name;

    private String surname;
    private Team team;


    private Long getId()
    {
        return id;
    }
    private String getName()
    {
        return name;
    }
    private void setName(String imie)
    {
        this.name=imie;
    }

    private String getSurname()
    {
        return surname;
    }
    private void setSurname(String imie)
    {
        this.surname = surname;
    }

}
