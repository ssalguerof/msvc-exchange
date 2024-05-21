package com.exchange.ssalguerof.msvc.conversiondivisas.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Entity
public class TransaccionDeCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal monto;
    private String monedaOrigen;
    private String monedaDestino;
    private BigDecimal montoConvertido;
    private BigDecimal tipoDeCambio;

    // Getters, setters y métodos de negocio

    public TransaccionDeCambio(BigDecimal monto, String monedaOrigen, String monedaDestino, BigDecimal montoConvertido, BigDecimal tipoDeCambio) {
        this.monto = monto;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.montoConvertido = montoConvertido;
        this.tipoDeCambio = tipoDeCambio;
    }
}
