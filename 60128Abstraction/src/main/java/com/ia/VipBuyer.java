package com.ia;

public class VipBuyer extends Buyer {
    public VipBuyer(String name, int age){//constructorius
    super(name, age);
    }

    @Override
    public double discountFor(Product product) {
        // duosim skirtinga discount skirtingiem products
        //jeigu tas product kuri gaudys discountFor methodas yra elektronix preke >grazinsim 10procentu nuolaida
        if(product instanceof ElectronicsProduct) return 0.10;
        if(product instanceof FoodProduct) return 0.05; // jeigu maisto produkt - grazinam 5proc nuolaida
        return 0.02; //visiem kitiems product 2proc nuolaida
    }

    @Override
    public boolean canBuy(Product product) {
        if(product instanceof AgeRestrictedProduct arp){
            return age() >= arp.minAge();
        }
        return true;
    }
}