package com.ia;

public class PricingContext {
    private Buyer buyer;
    public PricingContext(Buyer buyer){
        if(buyer==null) throw new IllegalArgumentException("buyer is required");
        this.buyer=buyer;
    }
    public Buyer buyer(){ //grazins pirkeja
        return buyer;
    }
}