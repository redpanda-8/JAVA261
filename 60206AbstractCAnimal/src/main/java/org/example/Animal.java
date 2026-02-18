package org.example;

public abstract class Animal {
    private String name;
    //konstruktorius
    public Animal(String name){
        this.name=name;
    }

    public abstract void greets();
}
