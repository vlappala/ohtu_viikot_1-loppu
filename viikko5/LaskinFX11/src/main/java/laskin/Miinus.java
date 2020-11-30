/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author T460
 */
public class Miinus extends Komento {
    
    private int edellinenArvo;
    
    public Miinus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        
        edellinenArvo = Integer.parseInt(tuloskentta.getText());
        
        int arvo = 0;
        
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } 
        catch (Exception e) {
        }
        
        sovellus.miinus(arvo);
        tuloskentta.setText(""+sovellus.tulos());
        
        int laskunTulos = sovellus.tulos();
    

        if ( laskunTulos==0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
        

    }  
    public void peru() {
        int nykyinenArvo = Integer.parseInt(tuloskentta.getText());
        tuloskentta.setText(""+edellinenArvo);
        edellinenArvo = nykyinenArvo;
    }
}
