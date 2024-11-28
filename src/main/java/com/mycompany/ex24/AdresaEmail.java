package com.mycompany.ex24;
class AdresaEmail {
    String utilizator;
    String domeniu;

    public AdresaEmail() {
        this.utilizator = "";
        this.domeniu = "";
    }

    public AdresaEmail(String utilizator, String domeniu) {
        this.utilizator = utilizator;
        this.domeniu = domeniu;
    }

    public AdresaEmail(AdresaEmail other) {
        this.utilizator = other.utilizator;
        this.domeniu = other.domeniu;
    }

    @Override
    public String toString() {
        return utilizator + "@" + domeniu;
    }
}