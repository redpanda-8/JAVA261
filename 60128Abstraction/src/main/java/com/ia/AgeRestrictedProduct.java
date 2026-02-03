package com.ia;

public class AgeRestrictedProduct {
    private int minAge;

    public AgeRestrictedProduct(String id, String name, Money basePrice, int minAge){
        super(id, name, basePrice);
        if(minAge<0) throw new IllegalArgumentException("minAge");
        this.minAge=minAge;
    }
    public int minAge(){
        return minAge;
    }

    @Override
    public Money finalPrice(PricingContext ctx) {
        return basePrice;
    }
}
