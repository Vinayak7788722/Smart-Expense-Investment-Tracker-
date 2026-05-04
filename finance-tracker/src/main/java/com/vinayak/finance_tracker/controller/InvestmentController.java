package com.vinayak.finance_tracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinayak.finance_tracker.Investmentservice.InvestmentService;
import com.vinayak.finance_tracker.dto.ApiResponse;
import com.vinayak.finance_tracker.dto.InvestmentDTO;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/investments")
public class InvestmentController {

    private final InvestmentService service;

    public InvestmentController(InvestmentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<ApiResponse<?>> add(@Valid @RequestBody InvestmentDTO dto) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>( 
                        "success",
                        "Investment added",
                        service.addInvestment(dto)
                ));
    }

    // READ
    @GetMapping
    public ResponseEntity<ApiResponse<?>> getAll() {

        return ResponseEntity.ok(
                new ApiResponse<>(
                        "success",
                        "Investments fetched",
                        service.getAllInvestments()
                ));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> delete(@PathVariable Long id) {

        service.deleteInvestment(id);

        return ResponseEntity.ok(
                new ApiResponse<>(
                        "success",
                        "Investment deleted",
                        null
                ));
    }
    @GetMapping("/summary")
    public ResponseEntity<ApiResponse<?>> getSummary() {

        return ResponseEntity.ok(
            new ApiResponse<>(
                "success",
                "Portfolio summary fetched",
                service.getSummary()
            )
        );
    }
   
    }
