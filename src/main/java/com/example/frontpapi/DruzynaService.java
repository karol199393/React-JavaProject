package com.example.frontpapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DruzynaService {
    private List<Druzyna> druzyny=new ArrayList<>();

    public void dodajDruzyne(Druzyna druzyna)
    {
        druzyny.add(druzyna);
    }

    public List<Druzyna> getDruzyny(){
        return druzyny;
    }


}
