package com.madebyibrahim.backend.controllers;

import com.madebyibrahim.backend.models.Transaction;
import com.madebyibrahim.backend.services.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionsController {
    @Autowired
    private TransactionsService transactionsService;

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionsService.getTransactions();
    }
}
