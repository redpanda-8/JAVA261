package com.ia;

public class ElectronicsProduct extends Product{
    //static - is sono keiciama
    private static double VAT=1.21;
    public ElectronicsProduct(String id, String name, Money basePrice){
        super(id, name, basePrice);
    }
    @Override
    public Money finalPrice(PricingContext ctx){
        return basePrice().times(VAT);
    }
}
