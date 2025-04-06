package com.medicalstore.repository;

import com.medicalstore.model.Bill;
import java.util.ArrayList;
import java.util.List;

public class BillRepository {
    private final List<Bill> database = new ArrayList<>();

    public void save(Bill bill) {
        database.add(bill);
    }

    public List<Bill> findAll() {
        return database;
    }
}
