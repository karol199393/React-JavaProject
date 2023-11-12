package com.example.frontpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Importy
@RestController
@RequestMapping("/api/druzyny")  // Adnotacja ustawiająca podstawowy adres dla endpointów w tym kontrolerze
public class DruzynaController {

    @Autowired
    private DruzynaService druzynaService;  // Wstrzyknięcie serwisu do obsługi logiki biznesowej związaną z drużynami

    @PostMapping  // Adnotacja dla obsługi żądań HTTP POST
    public ResponseEntity<Void> dodajDruzyne(@RequestBody Druzyna druzyna) {
        druzynaService.dodajDruzyne(druzyna);  // Wywołanie metody w serwisie do dodawania drużyny
        return new ResponseEntity<>(HttpStatus.CREATED);  // Zwrócenie odpowiedzi HTTP 201 Created
    }

    @GetMapping  // Adnotacja dla obsługi żądań HTTP GET
    public ResponseEntity<List<Druzyna>> pobierzDruzyny() {
        List<Druzyna> druzyny = druzynaService.getDruzyny();  // Wywołanie metody w serwisie do pobierania drużyn
        return new ResponseEntity<>(druzyny, HttpStatus.OK);  // Zwrócenie odpowiedzi HTTP 200 OK z listą drużyn
    }

    // Inne metody kontrolera (jeśli potrzebne)
}
