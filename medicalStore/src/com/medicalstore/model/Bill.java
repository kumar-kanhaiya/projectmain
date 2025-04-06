package com.medicalstore.model;

import java.time.LocalDate;
import java.util.List;

public class Bill {
    private Long id;
    private String customerName;
    private LocalDate date;
    private List<Item> items;

    public double getTotalAmount() {
        return items.stream().mapToDouble(Item::getSubtotal).sum();
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }
}
