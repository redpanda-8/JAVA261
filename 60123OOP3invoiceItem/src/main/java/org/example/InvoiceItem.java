package org.example;

public class InvoiceItem {
    // Fields encapsulation
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters (no setters for id and desc in UML)
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setters (only qty and unitPrice)
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // unitPrice * qty
    public double getTotal() {
        return unitPrice * qty;
    }

    // EXACT format from screenshot
    public String toString() {
        return "InvoiceItem[id=" + id +
                ",desc=" + desc +
                ",qty=" + qty +
                ",unitPrice=" + unitPrice + "]";
    }
}