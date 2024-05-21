package com.exchange.ssalguerof.msvc.conversiondivisas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConversionRequestDTO {
    private BigDecimal monto;
    private String monedaOrigen;
    private String monedaDestino;
}
