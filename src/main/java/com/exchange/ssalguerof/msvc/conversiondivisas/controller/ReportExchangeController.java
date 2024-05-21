package com.exchange.ssalguerof.msvc.conversiondivisas.controller;

import com.exchange.ssalguerof.msvc.conversiondivisas.application.ReportService;
import com.exchange.ssalguerof.msvc.conversiondivisas.dto.TransaccionDeCambioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportExchangeController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/transacciones")
    public List<TransaccionDeCambioDTO> getTransaccionesReport() {
        return reportService.getTransaccionesReport();
    }
}
