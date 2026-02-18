package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    //polyformizmas -perrasinejam methoda - ta pati method naudoti tuo paciu vardu bet naudoti skirtingai
    public void greets(Dog another){
        System.out.println("Wooof");
    }
}
