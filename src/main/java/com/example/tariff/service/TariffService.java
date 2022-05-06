package com.example.tariff.service;

import com.example.tariff.entity.Tariff;
import com.example.tariff.exceptions.TariffException;
import com.example.tariff.repository.TariffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TariffService {
    private final TariffRepository tariffRepository;

    public Tariff createTariff(Tariff tariff) {
        return tariffRepository.save(tariff);
    }

    public Tariff getTariff(Long id) {
        return tariffRepository.findTariffById(id).orElseThrow(() -> new TariffException("tariff not found"));
    }
}
