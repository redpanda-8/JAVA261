package org.example;
//ABSTRAKTI KLASE
public abstract class Animal {
    private String name;

    public Animal(){} //tuscias objekto konstruktorius (veikiantis),jeigu reiktu sukurti tsg tuscia
    //konstruktorius
    public Animal(String name){
        this.name=name;
    }

    public abstract void greets();
}
