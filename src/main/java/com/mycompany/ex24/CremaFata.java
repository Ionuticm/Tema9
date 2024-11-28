package com.mycompany.ex24;
class CremaFata extends Cosmetice {
    String tipPiele;

    public CremaFata() {
        super();
        this.tipPiele = "";
    }

    public CremaFata(String nume, double cantitate, double pret, String tipPiele) {
        super(nume, cantitate, pret);
        this.tipPiele = tipPiele;
    }

    public CremaFata(CremaFata other) {
        super(other);
        this.tipPiele = other.tipPiele;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip piele: " + tipPiele;
    }
}