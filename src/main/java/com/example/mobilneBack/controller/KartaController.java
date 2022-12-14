package com.example.mobilneBack.controller;

import com.example.mobilneBack.entity.Karta;
import com.example.mobilneBack.entity.Rezervacija;
import com.example.mobilneBack.repository.RezervacijaRepository;
import com.example.mobilneBack.service.KartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class KartaController {
    @Autowired
    private KartaService kartaService;

    @Autowired
    private RezervacijaRepository rezervacijaRepository;

    @PostMapping("/addKarta")
    public Karta addKarta(@RequestBody Karta karta) {
        try {

            Rezervacija rezervacija =
                    rezervacijaRepository.findById(karta.getRezervacija().getId())
                            .orElseThrow(() -> new IllegalArgumentException());

            karta.setRezervacija(rezervacija);
            return kartaService.addKarta(karta);
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/getPopunjenost")
    public String getPopunjenost(){

        return kartaService.getPopunjenost();
    }
}
