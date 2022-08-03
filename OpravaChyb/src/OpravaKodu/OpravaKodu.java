package OpravaKodu;

import java.math.BigDecimal;

public class OpravaKodu {

    public static void ukol1() {
        System.out.println("Hello world!");
    }

    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        String pocetLekci = "10";
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {

    /* varianta 1 - chyba na sedmém desetinném místě a je viditelná v sedmém iteračním kroku cyklu
        float cena = 0.0f; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena += 0.1;
            // operátor "+=" znamená: přičti ke stávající
            // hodnotě navíc 0.1
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    */

        /* varianta 2 - chyba není "viditelná" */
        BigDecimal cena = BigDecimal.ZERO;
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }


    }
