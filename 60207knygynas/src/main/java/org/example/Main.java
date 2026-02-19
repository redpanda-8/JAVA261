package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Knygynas knygynas = new Knygynas();

        knygynas.pridetiKnyga(new PopierineKnyga("Knyga 1", 20, "Jonas A", 100));
        knygynas.pridetiKnyga(new PopierineKnyga("Knyga 2", 25, "Jonas B", 150));
        knygynas.pridetiKnyga(new ElektronineKnyga("Knyga 3", 24, "Jonas A", 54));
        knygynas.pridetiKnyga(new ElektronineKnyga("Knyga 4", 30, "Jonas D", 10));

        knygynas.spausdintiKataloga();
        System.out.println("Bendra visu knygu verte: " + knygynas.bendraVerte());

        System.out.println("\nPaieska pagal autoriu Jonas A:");
        ArrayList<Knyga> rasta = knygynas.rastiPagalAutoriu("Jonas A");
        for (Knyga k : rasta) System.out.println(k);

        System.out.println("\nTrinu 'Knyga 2': " + knygynas.pasalintiPagalPavadinima("Knyga 2"));
        knygynas.spausdintiKataloga();
    }
}