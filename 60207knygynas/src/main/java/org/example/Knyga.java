package org.example;

public abstract class Knyga {
    protected String pavadinimas;
    protected String autorius;
    protected double kaina;

    public Knyga(String pavadinimas, double kaina, String autorius) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.autorius = autorius;
    }

    public String getPavadinimas() { return pavadinimas; }
    public String getAutorius() { return autorius; }
    public double getKaina() { return kaina; }

    public abstract String tipas();

    @Override
    public String toString() {
        return tipas() + " | " + pavadinimas + " | " + autorius + " | " + kaina + " EUR";
    }
}