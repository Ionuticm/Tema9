package com.mycompany.ex24;
class Ex24 {

    public static void main(String[] args) {
        Sampon sampon1 = new Sampon("Sampon Shine", 200, 25.5, "Normal");
        Sampon sampon2 = new Sampon("Sampon Argan", 300, 30, "Uscat");
        Sampon sampon3 = new Sampon("Sampon Menta", 400, 20, "Gras");

        CremaFata cremaFata1 = new CremaFata("Crema Hidratanta", 50, 45, "Sensibila");
        CremaFata cremaFata2 = new CremaFata("Crema Anti-aging", 100, 80, "Normala");
        CremaFata cremaFata3 = new CremaFata("Crema SPF", 75, 55, "Uscata");

        CremaCorp cremaCorp1 = new CremaCorp("Crema Satinata", 250, 60, "Vanilie");
        CremaCorp cremaCorp2 = new CremaCorp("Crema Cu Aloe", 150, 40, "Aloe Vera");
        CremaCorp cremaCorp3 = new CremaCorp("Crema Relax", 200, 50, "Lavanda");

        AfterShave afterShave1 = new AfterShave("AfterShave Fresh", 150, 35, true);
        AfterShave afterShave2 = new AfterShave("AfterShave Calm", 100, 25, false);
        AfterShave afterShave3 = new AfterShave("AfterShave Classic", 200, 40, true);

        GelDeDus gelDeDus1 = new GelDeDus("Gel Dus Citronella", 250, 20, "Citronella");
        GelDeDus gelDeDus2 = new GelDeDus("Gel Dus Lavamint", 200, 22, "Menta");
        GelDeDus gelDeDus3 = new GelDeDus("Gel Dus Oceanic", 300, 28, "Ocean");

        System.out.println(sampon1);
        System.out.println(sampon2);
        System.out.println(sampon3);

        System.out.println(cremaFata1);
        System.out.println(cremaFata2);
        System.out.println(cremaFata3);

        System.out.println(cremaCorp1);
        System.out.println(cremaCorp2);
        System.out.println(cremaCorp3);

        System.out.println(afterShave1);
        System.out.println(afterShave2);
        System.out.println(afterShave3);

        System.out.println(gelDeDus1);
        System.out.println(gelDeDus2);
        System.out.println(gelDeDus3);
    }
}
