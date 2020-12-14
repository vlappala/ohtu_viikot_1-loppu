/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author T460
 */
public abstract class KiviPaperiSakset {
    private static final Scanner scanner = new Scanner(System.in);
    
    protected String ekanSiirto;
    protected String tokanSiirto;
    
    public static KiviPaperiSakset ihmispeli() {
        return new KPSPelaajaVsPelaaja();
    }
    public static KiviPaperiSakset tekoaly() {
        return new KPSTekoaly();
    }
    public static KiviPaperiSakset pahaTekoaly() {
        return new KPSParempiTekoaly();
    }
    
    // tämä on ns template metodi
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        ekanSiirto = ensimmaisenSiirto();
        tokanSiirto = toisenSiirto();
        
        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);

            ekanSiirto = ensimmaisenSiirto();
            
            // System.out.println("Toisen pelaajan siirto: ");
            tokanSiirto = toisenSiirto();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    protected String ensimmaisenSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    // tämä on abstrakti metodi sillä sen toteutus vaihtelee eri pelityypeissä
    abstract protected String toisenSiirto();
    
    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}

