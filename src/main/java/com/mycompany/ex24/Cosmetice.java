package com.mycompany.ex24;
public class Cosmetice {
    String nume;
    double cantitate;
    double pret;

    public Cosmetice() {
        this.nume = "";
        this.cantitate = 0;
        this.pret = 0;
    }

    public Cosmetice(String nume, double cantitate, double pret) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Cosmetice(Cosmetice other) {
        this.nume = other.nume;
        this.cantitate = other.cantitate;
        this.pret = other.pret;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + ", Cantitate: " + cantitate + " ml, Pret: " + pret + " lei";
    }
}
