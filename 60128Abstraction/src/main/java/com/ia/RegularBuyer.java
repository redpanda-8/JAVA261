package com.ia;

public class RegularBuyer extends Buyer {
    public RegularBuyer(String name, int age){ //pasidrom constrtoriu
        super(name, age); //callinam construtriu ka turim abstrakcioj klasej
    }

    @Override
    public double discountFor(Product product) {
        return 0.0;
    }

    @Override //tikrinam arGaliPirkti
    //ar produkto objektas priklauso klasei AgeRestrictedProduct ir duodam kintamaji arp >grazinam age
    public boolean canBuy(Product product) {
        //ar methodas paduotas i canBuy yra priklausantis OBJEKTUI kurio tipas AgeRestrictedProduct ir duodam jam arp trumpini
        if(product instanceof AgeRestrictedProduct arp){
            return age() >=arp.minAge(); //grazink age kuris yra didesnis arba lygus arp.minAge
        }
        return true;
    }
}
