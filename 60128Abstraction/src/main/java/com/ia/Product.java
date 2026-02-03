package com.ia;

public abstract class Product {
    private String id;
    private String name;
    private Money basePrice;

    protected Product(String id, String name, Money basePrice){
        if(id==null || id.isBlank()) throw new IllegalArgumentException("id required");
        if(name==null || name.isBlank()) throw new IllegalArgumentException("name required");
        if(basePrice==null) throw new IllegalArgumentException("basePrice required");

        this.id=id;
        this.name=name;
        this.basePrice=basePrice;
    }
    public String id(){return id;}
    public String name(){return name;}
    public Money basePrice(){return basePrice;}

    public abstract Money finalPrice(PricingContext ctx);
}
