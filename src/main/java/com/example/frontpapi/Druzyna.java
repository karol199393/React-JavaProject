package com.example.frontpapi;
import java.util.ArrayList;
import java.util.List;

public class Druzyna {
    private Long id;
    private String nazwa;
    private List<Zawodnik> zawodnicy = new ArrayList<>();
    private List<Trener> trenerzy = new ArrayList<>();

    private Long getId(){
        return id;
    }
    private String getNazwa()
    {
        return nazwa;
    }
    private String getZawodnicy()
    {
        return "";
    }

    private String getTrener()
    {
        return "";
    }
    private void setId(long id)
    {
        this.id=id;
    }
    private void setNazwa(String nazwa)
    {
        this.nazwa=nazwa;
    }


}
