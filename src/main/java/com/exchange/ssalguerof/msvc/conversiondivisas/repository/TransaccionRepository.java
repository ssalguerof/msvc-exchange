package com.exchange.ssalguerof.msvc.conversiondivisas.repository;

import com.exchange.ssalguerof.msvc.conversiondivisas.domain.entity.TransaccionDeCambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<TransaccionDeCambio, Long> {
}
