package ohtu.kivipaperisakset;

// Tuomari pitää kirjaa ensimmäisen ja toisen pelaajan pisteistä sekä tasapelien määrästä.
public class Tuomari {

    private int ekanPisteet;
    private int tokanPisteet;
    private int tasapelit;

    public Tuomari() {
        this.ekanPisteet = 0;
        this.tokanPisteet = 0;
        this.tasapelit = 0;
    }

    public void kirjaaSiirto(String ekanSiirto, String tokanSiirto) {
        if (ekanSiirto.equals(tokanSiirto)) {
            tasapelit++;
            
        } else if (("k".equals(ekanSiirto) && "s".equals(tokanSiirto)) ||
                    ("s".equals(ekanSiirto) && "p".equals(tokanSiirto)) ||
                    ("p".equals(ekanSiirto) && "k".equals(tokanSiirto))) {
            ekanPisteet++;
            
        } else {
            tokanPisteet++;
            
        }
        System.out.println(this);
        System.out.println("");
    }

//    // sisäinen metodi, jolla tarkastetaan tuliko tasapeli
//    private static boolean tasapeli(String eka, String toka) {
//        if (eka.equals(toka)) {
//            return true;
//        }
//
//        return false;
//    }
//
//    // sisäinen metodi joka tarkastaa voittaako eka pelaaja tokan
//    private static boolean ekaVoittaa(String eka, String toka) {
//        if ("k".equals(eka) && "s".equals(toka)) {
//            return true;
//        } else if ("s".equals(eka) && "p".equals(toka)) {
//            return true;
//        } else if ("p".equals(eka) && "k".equals(toka)) {
//            return true;
//        }
//
//        return false;
//    }

    public String toString() {
        String s = "Pelitilanne: " + ekanPisteet + " - " + tokanPisteet + "\n"
                + "Tasapelit: " + tasapelit;
        return s;
    }
}