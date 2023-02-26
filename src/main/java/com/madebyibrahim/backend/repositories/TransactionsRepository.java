package com.madebyibrahim.backend.repositories;

import com.madebyibrahim.backend.models.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionsRepository {

    public List<Transaction> getTransactions() {
        return List.of(
                new Transaction("1", "Transaction 1", "Description 1", "100", "2021-01-01", "Food"),
                new Transaction("2", "Transaction 2", "Description 2", "200", "2021-01-02", "Food"),
                new Transaction("3", "Transaction 3", "Description 3", "300", "2021-01-03", "Food"),
                new Transaction("4", "Transaction 4", "Description 4", "400", "2021-01-04", "Food"),
                new Transaction("5", "Transaction 5", "Description 5", "500", "2021-01-05", "Food"),
                new Transaction("6", "Transaction 6", "Description 6", "600", "2021-01-06", "Food"),
                new Transaction("7", "Transaction 7", "Description 7", "700", "2021-01-07", "Food"),
                new Transaction("8", "Transaction 8", "Description 8", "800", "2021-01-08", "Food"),
                new Transaction("9", "Transaction 9", "Description 9", "900", "2021-01-09", "Food"),
                new Transaction("10", "Transaction 10", "Description 10", "1000", "2021-01-10", "Food")
        );
    }
}
