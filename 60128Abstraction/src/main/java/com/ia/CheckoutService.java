package com.ia;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public Receipt chechout(Buyer buyer, Cart cart){ //leis pirkti - kad grazint ceki duoddam pirkeja, pirkiniu krepsely
        PricingContext ctx = new PricingContext(buyer); // kuria objekta naudojant kompozicija gaunant pirkeja
        //gauti eilutes(inicijuot arraylista, bet jis dar nera sukurtas-tdl sukuriam lista)
        List<ReceiptLine> lines = new ArrayList<>();

        Money total = Money.eur(0);

        for(CartItem item : cart.items()){
            Product p = item.product();

            if(!buyer.canBuy(p)){
                throw new IllegalStateException("Pirkejas negali pirkti");
            }

            Money unit = p.finalPrice(ctx);
            double disc = returnRoundedDiscount(buyer.discountFor(p));

            Money discountedUnit = unit.times(item.qty()); //gausim kokio dydzio nuolaida

            Money lineTotal = discountedUnit.times(item.qty());
            total = total.plus(lineTotal);
            lines.add(new ReceiptLine(p.name(), item.qty(), unit, disc, lineTotal));
        }

        //grazinam pati ceki
        return new Receipt(buyer.name(), lines, total);
    }
    //return discount
    private double returnRoundedDiscount(double x){
        if(x < 0) return 0;
        if(x > 0.9) return 0.9;
        return x;
    }
}
