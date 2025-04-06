package com.medicalstore.controller;

import com.medicalstore.model.Bill;
import com.medicalstore.service.BillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateBill(@RequestBody Bill bill) {
        billService.saveBill(bill);
        return ResponseEntity.ok("Bill generated successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bill>> getAllBills() {
        List<Bill> bills = billService.getAllBills();
        return ResponseEntity.ok(bills);
    }
}
