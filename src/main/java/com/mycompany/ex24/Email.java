package com.mycompany.ex24;

import com.mycompany.ex24.AdresaEmail;

public class Email {
    AdresaEmail expeditor;
    AdresaEmail destinatar;
    String subiect;
    String corp;

    public Email() {
        this.expeditor = new AdresaEmail();
        this.destinatar = new AdresaEmail();
        this.subiect = "";
        this.corp = "";
    }

    public Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String corp) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.corp = corp;
    }

    public Email(Email other) {
        this.expeditor = new AdresaEmail(other.expeditor);
        this.destinatar = new AdresaEmail(other.destinatar);
        this.subiect = other.subiect;
        this.corp = other.corp;
    }

    public void trimite() {
        System.out.println("Expeditor: " + expeditor);
        System.out.println("Destinatar: " + destinatar);
        System.out.println("Subiect: " + subiect);
        System.out.println("Mesaj: " + corp);
        System.out.println("Email trimis cu succes!");
    }

    public void primeste() {
        System.out.println("Email primit de la: " + expeditor);
        System.out.println("Subiect: " + subiect);
        System.out.println("Mesaj: " + corp);
        System.out.println("Email citit cu succes!");
    }

    @Override
    public String toString() {
        return "Expeditor: " + expeditor + "\nDestinatar: " + destinatar + "\nSubiect: " + subiect + "\nMesaj: " + corp +"\n";
    }
}
