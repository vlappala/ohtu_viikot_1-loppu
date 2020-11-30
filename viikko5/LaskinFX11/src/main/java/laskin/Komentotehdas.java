///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package laskin;
//
//import java.util.HashMap;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//
///**
// *
// * @author T460
// */
//public class Komentotehdas {
//    private HashMap<String, Komento> komennot;
//    private Komento tulos;
//
//    public Komentotehdas(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
//        komennot = new HashMap<String, Komento>();
//        komennot.put("plus", new Plus(tuloskentta, syotekentta, nollaa, undo, sovellus));
//        komennot.put("miinus", new Miinus(tuloskentta, syotekentta, nollaa, undo, sovellus));
//        komennot.put("nollaa", new Nollaa(tuloskentta, syotekentta, nollaa, undo, sovellus));
//        // tulos = new Tulos();
//    }
//
//    public Komento hae(String operaatio) {
//        return komennot.getOrDefault(operaatio, tulos);
//    }
//}
//
