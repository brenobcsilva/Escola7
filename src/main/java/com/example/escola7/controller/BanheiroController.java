package com.example.escola7.controller;

import com.example.escola7.persistence.repository.BanheiroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanheiroController {

    private final BanheiroRepository banheiroRepository;

    public BanheiroController(BanheiroRepository banheiroRepository) {
        this.banheiroRepository = banheiroRepository;
    }

    @GetMapping("/mostrarBanheiro")
    public ResponseEntity<?> mostrarBanheiros(){
        return new ResponseEntity<>(banheiroRepository.findAll(), HttpStatus.OK);
    }
}
