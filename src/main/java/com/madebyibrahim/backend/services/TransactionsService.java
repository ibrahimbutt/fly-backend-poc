package com.madebyibrahim.backend.services;

import com.madebyibrahim.backend.models.Transaction;
import com.madebyibrahim.backend.repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepository transactionsRepository;

    public List<Transaction> getTransactions() {
        return transactionsRepository.getTransactions();
    }
}
