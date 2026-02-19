package org.example;

public class PopierineKnyga extends Knyga {
    private int puslapiai;

    public PopierineKnyga(String pavadinimas, double kaina, String autorius, int puslapiai) {
        super(pavadinimas, kaina, autorius);
        this.puslapiai = puslapiai;
    }

    @Override
    public String tipas() {
        return "Popierine knyga (" + puslapiai + " psl.)";
    }
}