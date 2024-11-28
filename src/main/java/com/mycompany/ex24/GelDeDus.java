package com.mycompany.ex24;
class GelDeDus extends Cosmetice {
    String aroma;

    public GelDeDus() {
        super();
        this.aroma = "";
    }

    public GelDeDus(String nume, double cantitate, double pret, String aroma) {
        super(nume, cantitate, pret);
        this.aroma = aroma;
    }

    public GelDeDus(GelDeDus other) {
        super(other);
        this.aroma = other.aroma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Aroma: " + aroma;
    }
}
