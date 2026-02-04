package com.ia;

import java.util.ArrayList;

public class Cart {
    //i array list des cart items
    private ArrayList<CartItem> items = new ArrayList<>();
    //kad isvesti produkt ir kieki
    public void add(Product product, int qty){
        items.add(new CartItem(product, qty)); //dedam i arraylist
    }
    public ArrayList<CartItem> items(){
        return items;
    }
}