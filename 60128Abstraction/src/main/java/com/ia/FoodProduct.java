package com.ia;

public class FoodProduct extends Product{
    //neturim properties, tai iskart constructorius
    public FoodProduct(String id, String name, Money basePrice){
        super(id, name, basePrice);
    }
    @Override
    public Money finalPrice(PricingContext ctx){
        return basePrice();
    }
}
