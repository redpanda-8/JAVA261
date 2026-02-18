package org.example;

//polyformizmas -perrasinejam methoda - ta pati method naudoti tuo paciu vardu bet naudoti skirtingai
//poly - daug formu
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("kitty");
        cat1.greets();
        Dog dog1 = new Dog("Bobikas");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Didelis bobikas");
        bigDog1.greets();
    }
}
