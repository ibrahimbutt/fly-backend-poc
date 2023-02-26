package com.madebyibrahim.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
    private String id;
    private String name;
    private String description;
    private String amount;
    private String date;
    private String category;
}
