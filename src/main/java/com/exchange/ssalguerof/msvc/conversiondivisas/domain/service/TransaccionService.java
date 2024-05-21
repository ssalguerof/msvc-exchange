package com.exchange.ssalguerof.msvc.conversiondivisas.domain.service;

import com.exchange.ssalguerof.msvc.conversiondivisas.domain.entity.TransaccionDeCambio;
import com.exchange.ssalguerof.msvc.conversiondivisas.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    public List<TransaccionDeCambio> getAllTransacciones(){
        return transaccionRepository.findAll();
    }
}
