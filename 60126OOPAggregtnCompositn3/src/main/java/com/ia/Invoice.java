package com.ia;

public class Invoice {
    private int id;
    private Customer customer; // Aggregation: Invoice holds a reference to a Customer
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }

    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer=customer;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        // Calculate: amount - (amount * (discount / 100))
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        // The customer.toString() is automatically called inside this string concatenation
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
    }
}
