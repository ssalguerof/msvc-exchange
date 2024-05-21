package com.exchange.ssalguerof.msvc.conversiondivisas.domain.service;

import com.exchange.ssalguerof.msvc.conversiondivisas.client.ExchangeRateClient;
import com.exchange.ssalguerof.msvc.conversiondivisas.domain.entity.TransaccionDeCambio;
import com.exchange.ssalguerof.msvc.conversiondivisas.dto.ConversionRequestDTO;
import com.exchange.ssalguerof.msvc.conversiondivisas.dto.TransaccionDeCambioDTO;
import com.exchange.ssalguerof.msvc.conversiondivisas.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class ConversionService {
    @Autowired
    private TransaccionRepository repository;

    @Autowired
    private ExchangeRateClient exchangeRateClient;

    public TransaccionDeCambioDTO convertir(ConversionRequestDTO requestDTO) {
        BigDecimal tipoDeCambio = exchangeRateClient.getExchangeRate(requestDTO.getMonedaOrigen()).getConversion_rates().get(requestDTO.getMonedaDestino());
        BigDecimal montoConvertido = requestDTO.getMonto().multiply(tipoDeCambio);

        TransaccionDeCambio transaccion = new TransaccionDeCambio(requestDTO.getMonto(), requestDTO.getMonedaOrigen(), requestDTO.getMonedaDestino(), montoConvertido, tipoDeCambio);
        repository.save(transaccion);

        return new TransaccionDeCambioDTO(transaccion.getMonto(), transaccion.getMontoConvertido(), transaccion.getMonedaOrigen(), transaccion.getMonedaDestino(), transaccion.getTipoDeCambio());
    }
}
