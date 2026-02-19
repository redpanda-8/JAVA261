package org.example;
//REALIZUOJANTI KLASE KURI PERKRAUNA METHODS (su skirtingais params)
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    //polyformizmas -perrasinejam methoda - ta pati method naudoti tuo paciu vardu bet naudoti skirtingai
    //overloading -perkraunam method su skirtingais params -method name(greets) ir tipas(void)turi sutapti, bet (params) skirias
    public void greets(Dog another){
        System.out.println("Wooof");
    }
}
