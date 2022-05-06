package com.example.tariff.controller;

import com.example.tariff.entity.Tariff;
import com.example.tariff.service.TariffService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TariffController {
    private final TariffService tariffService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "api/tariff")
    public Tariff createTariff(@RequestBody Tariff tariff){
        return tariffService.createTariff(tariff);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "api/tariff/{deviceId}")
    public Tariff getTariff(@PathVariable Long deviceId){
        return tariffService.getTariff(deviceId);

    }
}
