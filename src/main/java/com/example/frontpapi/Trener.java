package com.example.frontpapi;

public class Trener {
    private Long id;
    private String imie;
    private String nazwisko;
    private Druzyna druzyna;

    private Long getId()
    {
        return id;
    }
    private String getImie()
    {
        return imie;
    }
    private void setImie(String imie)
    {
        this.imie=imie;
    }

    private String getNazwisko()
    {
        return nazwisko;
    }
    private void setNazwisko(String imie)
    {
        this.nazwisko=nazwisko;
    }

}
