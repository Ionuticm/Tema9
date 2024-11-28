package com.mycompany.ex24;
class Sampon extends Cosmetice {
    String tipPar;

    public Sampon() {
        super();
        this.tipPar = "";
    }

    public Sampon(String nume, double cantitate, double pret, String tipPar) {
        super(nume, cantitate, pret);
        this.tipPar = tipPar;
    }

    public Sampon(Sampon other) {
        super(other);
        this.tipPar = other.tipPar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip par: " + tipPar;
    }
}