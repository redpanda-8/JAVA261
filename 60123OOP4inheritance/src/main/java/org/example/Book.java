package org.example;

public class Book extends Publication{
    String author;
    int pages;
    //construktorius
    public Book(String title, double price, String author, int pages) {
        super(title, price);
        this.author=author;
        this.pages=pages;
    }
    // OVER RIDE - PERRASINEJU METHOD
    // NEGALI SKIRTIS PARAMETRAI - JEIGU BE PARAMS-BE PARAMS-METHODO PARASAS IDENTISKAS
    @Override
    public String getDeliveryInfo(){
        return "Author"+author+".Pages"+pages;
    }
}
