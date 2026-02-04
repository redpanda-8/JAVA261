package com.ia;

public abstract class Buyer {
    private String name;
    private int age;

    //nes reiks paveldeti konstruktoriu- cnstctor turi buti protected-ji nores naudoti ta klase kuri paveldi, bet isorej neledzia naudoti
    protected Buyer(String name, int age){
        if(name==null||name.isBlank()) throw new IllegalArgumentException("name is required");
        if(age<0) throw new IllegalArgumentException("age is invalid");
        this.name=name;
        this.age=age;
    }
    public String name(){
        return name;
    }
    public int age(){
        return age;
    }

    //kas paveldes sita klase-liepam implementuoti du methods-discountui ir arGeliPirktiPirkejas
    public abstract double discountFor(Product product);
    public abstract boolean canBuy(Product product);
}
