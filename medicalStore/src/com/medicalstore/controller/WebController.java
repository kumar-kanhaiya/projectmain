// controller/WebController.java
package com.medicalstore.controller;

import com.medicalstore.model.Bill;
import com.medicalstore.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private BillService billService;

    @GetMapping("/invoice")
    public String showInvoice(Model model) {
        List<Bill> bills = billService.getAllBills();
        model.addAttribute("bills", bills);
        return "invoice";
    }
}
