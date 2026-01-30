package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Publication publication = new Publication("Lietuvos dienorastis",2000.00);
        System.out.println(publication.getInfo());

        //geras OVERLOADING pvz - kad nekurti daug skirtu metodu
        System.out.println(publication.getInfo(false));
        Book bookOne=new Book("Java for beginers",25,"Deimante",2000);
        System.out.println(bookOne.getInfo());

        Ebook ebook= new Ebook("JS",36,"PDF",100);
        System.out.println(ebook.getDeliveryInfo());
    }
}
