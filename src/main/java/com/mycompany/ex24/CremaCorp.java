package com.mycompany.ex24;
class CremaCorp extends Cosmetice {
    String parfumat;

    public CremaCorp() {
        super();
        this.parfumat = "";
    }

    public CremaCorp(String nume, double cantitate, double pret, String parfumat) {
        super(nume, cantitate, pret);
        this.parfumat = parfumat;
    }

    public CremaCorp(CremaCorp other) {
        super(other);
        this.parfumat = other.parfumat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Parfumat: " + parfumat;
    }
}
