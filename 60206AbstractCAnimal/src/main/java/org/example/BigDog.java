package org.example;
//REALIZUOJANTI KLASE
public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woow");
    }
    public void greets(Dog another){
        System.out.println("Wooow");
    }
    public void greets(BigDog another){
        System.out.println("Woooooow");
    }
}
