package com.mycompany.ex24;
class AfterShave extends Cosmetice {
    boolean alcool;

    public AfterShave() {
        super();
        this.alcool = false;
    }

    public AfterShave(String nume, double cantitate, double pret, boolean alcool) {
        super(nume, cantitate, pret);
        this.alcool = alcool;
    }

    public AfterShave(AfterShave other) {
        super(other);
        this.alcool = other.alcool;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contine alcool: " + (alcool ? "Da" : "Nu");
    }
}