package com.mycompany.ex24;

import com.mycompany.ex24.Email;
import com.mycompany.ex24.AdresaEmail;

public class Ex25 {

    public static void main(String[] args) {
        AdresaEmail adresaExpeditor = new AdresaEmail("ion.popescu", "exemplu.com");
        AdresaEmail adresaDestinatar = new AdresaEmail("maria.ionescu", "exemplu.com");

        Email email1 = new Email(adresaExpeditor, adresaDestinatar, "Intrebare", "Buna, Maria! Cum te simti?");
        
        email1.trimite();
        email1.primeste();
    }
}
