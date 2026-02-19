package org.example;

//polyformizmas -perrasinejam methoda - ta pati method naudoti tuo paciu vardu bet naudoti skirtingai
//poly - daug formu
public class Main {
    public static void main(String[] args) {
        // TEST using subclasses - imam kate ir jam priskyrem kate
        Cat cat1 = new Cat("kitty");
        cat1.greets();
        Dog dog1 = new Dog("Bobikas");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Didelis bobikas");
        bigDog1.greets();

        // TEST using Polymorphism (animal nekuri, tik Animal tipa - Animal bendrine klase)
        //imam Animal ir jam priskyrem kate
        Animal animal1 = new Cat("Kate");
        animal1.greets();
        Animal animal2 = new Dog("Suo");
        animal2.greets();
        Animal animal3 = new BigDog("Suo didelis");
        animal3.greets();
        //kadangi Animal klase absoliuti-negalim taip paprastai sukurti objekto, turim realizuot jo method greets padarydami anonimine klase
//        Animal animal4 = new Animal() {
//            @Override
//            public void greets() {
//            }
//        }
        // TEST using Downcast - tipo keitimas (Dog-pakeiciu dog2 tipa)
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal1;
        dog2.greets(dog3);
    }
}
