package com.ia;

public class FoodProduct extends Product{
    public FoodProduct(String id, String name, Money basePrice){

    }
    @Override
    public Money finalPrice(PricingContext ctx){
        return basePrice();
    }
}
