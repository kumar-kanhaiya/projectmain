package com.medicalstore.model;

public class Item {
    private Product product;
    private int quantity;

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    // Getters & Setters
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
