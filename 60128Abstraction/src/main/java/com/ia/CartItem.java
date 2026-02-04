package com.ia;
//kai reikia paprasto objekto - RECORD - nereikia getter/setter/toString ir pan (records tarpusavy nesikalba)
//jo niekad nekeiti - glaustas klases tipas, skirtas nekintamu data modeliavimui - final
//konstructor kad pavaliduoti duomenis
public record CartItem(Product product, int qty) {
    public CartItem{
        if(product==null) throw new IllegalArgumentException("product is required");
        if(qty <=0) throw new IllegalArgumentException("qty must be > 0");
    }
}