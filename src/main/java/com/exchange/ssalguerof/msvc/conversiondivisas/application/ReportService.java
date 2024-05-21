package com.exchange.ssalguerof.msvc.conversiondivisas.application;

import com.exchange.ssalguerof.msvc.conversiondivisas.domain.entity.TransaccionDeCambio;
import com.exchange.ssalguerof.msvc.conversiondivisas.domain.service.TransaccionService;
import com.exchange.ssalguerof.msvc.conversiondivisas.dto.TransaccionDeCambioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {
    private final TransaccionService transaccionService;

    @Autowired
    public ReportService(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    public List<TransaccionDeCambioDTO> getTransaccionesReport() {
        List<TransaccionDeCambio> transacciones = transaccionService.getAllTransacciones();
        return transacciones.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private TransaccionDeCambioDTO convertToDTO(TransaccionDeCambio transaccion) {
        return new TransaccionDeCambioDTO(
                transaccion.getId(),
                transaccion.getMonto(),
                transaccion.getMontoConvertido(),
                transaccion.getMonedaOrigen(),
                transaccion.getMonedaDestino(),
                transaccion.getTipoDeCambio()
        );
    }
}
