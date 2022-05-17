package com.example.tariff.service;

import com.example.tariff.entity.Tariff;
import com.example.tariff.exceptions.TariffException;
import com.example.tariff.repository.TariffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TariffService {
    private final TariffRepository tariffRepository;

    @Transactional
    public Tariff createTariff(Tariff tariff) {
        return tariffRepository.save(tariff);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Tariff getTariff(Long id) {
        return tariffRepository.findTariffById(id).orElseThrow(() -> new TariffException("tariff not found"));
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<Tariff> getAllTariff() {
        return tariffRepository.findAll();
    }
}
