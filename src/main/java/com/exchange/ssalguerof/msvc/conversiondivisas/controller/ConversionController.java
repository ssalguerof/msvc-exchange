package com.exchange.ssalguerof.msvc.conversiondivisas.controller;


import com.exchange.ssalguerof.msvc.conversiondivisas.domain.service.ConversionService;
import com.exchange.ssalguerof.msvc.conversiondivisas.dto.ConversionRequestDTO;
import com.exchange.ssalguerof.msvc.conversiondivisas.dto.TransaccionDeCambioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/convertir")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @PostMapping
    public ResponseEntity<TransaccionDeCambioDTO> convertir(@RequestBody ConversionRequestDTO requestDTO) {
        TransaccionDeCambioDTO resultado = conversionService.convertir(requestDTO);
        return ResponseEntity.ok(resultado);
    }
}
