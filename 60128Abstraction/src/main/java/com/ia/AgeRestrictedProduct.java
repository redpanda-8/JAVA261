package com.ia;

public class AgeRestrictedProduct extends Product{
    private int minAge;

    public AgeRestrictedProduct(String id, String name, Money basePrice, int i){
        super(id, name, basePrice);
        if(minAge<0) throw new IllegalArgumentException("minAge");
        this.minAge=minAge;
    }
    public int minAge(){ //getteris for age
        return minAge;
    }

    @Override
    public Money finalPrice(PricingContext ctx) {
        return basePrice();
    }
}
