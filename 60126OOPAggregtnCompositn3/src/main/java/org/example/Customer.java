package org.example;

public class Customer {
    private int id;
    private String name;
    private int discount; // Discount in percent

    public Customer(int id, String name, int discount) {
        this.id=id;
        this.name=name;
        this.discount=discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount=discount;
    }

    @Override
    public String toString() {
        // Formats as "name(id)(discount%)"
        return name + "(" + id + ")(" + discount + "%)";
    }
}
