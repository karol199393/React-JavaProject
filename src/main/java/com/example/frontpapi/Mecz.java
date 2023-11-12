package com.example.frontpapi;

public class Mecz {
    private Long id;
    private Druzyna druzynaA;
    private Druzyna druzynaB;
    private int wynikDruzynyA;
    private int wynikDruzynyB;

    private Long getId()
    {
        return id;
    }
    private void setdruzynaA(Druzyna druzynaA)
    {
        this.druzynaA=druzynaA;
    }
    private void setdruzynaB(Druzyna druzynaB)
    {
        this.druzynaB=druzynaB;
    }

    private int getWynikDruzynyA(){
        return wynikDruzynyA;
    }
    private int getWynikDruzynyB(){
        return wynikDruzynyB;
    }


}
