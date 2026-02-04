package com.ia;

public class Main {
    public static void main(String[] args){
        Product bread = new FoodProduct("F-001", "Duona", Money.eur(1.50));
        Product phone=new ElectronicsProduct("E-100", "Phone", Money.eur(500));
        Product energyDrink=new AgeRestrictedProduct ("R-777", "Ener.gerimas", Money.eur(3), 16);

        Buyer regular=new RegularBuyer("Tomas", 16);
        Buyer vip=new VipBuyer("Asta", 28);

        Cart cart1=new Cart();
        cart1.add(bread, 2);
        cart1.add(energyDrink, 1); //Tomas 16 > turi mest klaida

        Cart cart2=new Cart();
        cart2.add(bread, 2);
        cart2.add(phone, 1);
        cart2.add(energyDrink, 3);

        CheckoutService checkout=new CheckoutService();

        //turi luzti del amziaus
        try{
            Receipt r1 = checkout.chechout(regular, cart1);
            print(r1);
        } catch (Exception e){
            System.out.println("Nepavyko checkout" +e.getMessage());
        }
        //VIP pirkejas
        Receipt r2 = checkout.chechout(vip, cart2);
        print(r2);
    }
    private static void print(Receipt r){
        System.out.println("===CEKIS: " +r.buyerName() +" ===");
        for (ReceiptLine line : r.lines()) {
            System.out.println(
                    line.productName() + "x" +line.qty()
                    + "|vnt" +line.unitPrice()
                    + "|nuolaida" +(int)(line.discount()*100)+"%"
//                    + "|suma" +line.lineTotal()
            );
        }
        System.out.println("Total" +r.total());
        System.out.println();
    }
}