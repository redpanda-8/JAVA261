package org.example;

import java.util.ArrayList;

public class Knygynas {
    private ArrayList<Knyga> katalogas = new ArrayList<>();

    public void pridetiKnyga(Knyga k) {
        katalogas.add(k);
    }

    public boolean pasalintiPagalPavadinima(String pavadinimas) {
        for (int i = 0; i < katalogas.size(); i++) {
            if (katalogas.get(i).getPavadinimas().equalsIgnoreCase(pavadinimas)) {
                katalogas.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Knyga> rastiPagalAutoriu(String autorius) {
        ArrayList<Knyga> result = new ArrayList<>();
        for (Knyga k : katalogas) {
            if (k.getAutorius().equalsIgnoreCase(autorius)) {
                result.add(k);
            }
        }
        return result;
    }

    public double bendraVerte() {
        double total = 0;
        for (Knyga k : katalogas) {
            total += k.getKaina();
        }
        return total;
    }

    public void spausdintiKataloga() {
        if (katalogas.isEmpty()) {
            System.out.println("Knygynas tuscias.");
            return;
        }
        System.out.println("Knygyno katalogas:");
        for (Knyga k : katalogas) {
            System.out.println(k); // polimorfizmas: kviečia override’intą toString/tipas
        }
    }
}