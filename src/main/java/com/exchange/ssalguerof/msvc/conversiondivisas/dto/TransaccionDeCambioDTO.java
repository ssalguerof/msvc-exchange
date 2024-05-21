package com.exchange.ssalguerof.msvc.conversiondivisas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class TransaccionDeCambioDTO {
    private BigDecimal monto;
    private BigDecimal montoConvertido;
    private String monedaOrigen;
    private String monedaDestino;
    private BigDecimal tipoDeCambio;

    // Constructor, getters y setters
    public TransaccionDeCambioDTO(BigDecimal monto, BigDecimal montoConvertido, String monedaOrigen, String monedaDestino, BigDecimal tipoDeCambio) {
        this.monto = monto;
        this.montoConvertido = montoConvertido;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tipoDeCambio = tipoDeCambio;
    }
}
