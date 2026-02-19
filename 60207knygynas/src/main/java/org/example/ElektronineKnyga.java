package org.example;

public class ElektronineKnyga extends Knyga {
    private int dydisMb;

    public ElektronineKnyga(String pavadinimas, double kaina, String autorius, int dydisMb) {
        super(pavadinimas, kaina, autorius);
        this.dydisMb = dydisMb;
    }

    @Override
    public String tipas() {
        return "Elektronine knyga (" + dydisMb + " MB)";
    }
}