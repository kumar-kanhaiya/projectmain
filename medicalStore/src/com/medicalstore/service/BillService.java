package com.medicalstore.service;

import com.medicalstore.model.Bill;
import com.medicalstore.repository.BillRepository;

import java.util.List;

public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public void saveBill(Bill bill) {
        billRepository.save(bill);
    }

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }
}
