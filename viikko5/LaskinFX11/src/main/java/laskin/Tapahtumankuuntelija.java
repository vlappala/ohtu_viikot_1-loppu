package laskin;

import java.util.HashMap;
import java.util.Map;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static javax.management.Query.plus;

public class Tapahtumankuuntelija implements EventHandler {

    private Button undo;
    private Button nollaa;
    private Sovelluslogiikka sovellus;
    private Map<Button, Komento> komennot;
    private Komento edellinen = null;

    
    public Tapahtumankuuntelija(TextField tuloskentta, TextField syotekentta, Button plus, Button miinus, Button nollaa, Button undo) {
        this.undo = undo;
        this.nollaa = nollaa;
        this.sovellus = new Sovelluslogiikka();
        this.komennot = new HashMap<>();
        this.komennot.put(plus, new Plus(tuloskentta, syotekentta,  nollaa, undo, sovellus) );
        this.komennot.put(miinus, new Miinus(tuloskentta, syotekentta, nollaa, undo, sovellus) );
        this.komennot.put(nollaa, new Nollaa(tuloskentta, syotekentta,  nollaa, undo, sovellus) );
    }
    
    
    
        @Override
        public void handle(Event event) {
        if ( event.getTarget() != undo ) {
            Komento komento = this.komennot.get((Button)event.getTarget());
            komento.suorita();
            this.edellinen = komento;
        } else {
            if (this.edellinen != null) {
                this.edellinen.peru();
            }
            this.edellinen = null;
        }                  
        

    }
//    @Override
//    public void handle(Event event) {
//        int arvo = 0;
// 
//        try {
//            arvo = Integer.parseInt(syotekentta.getText());
//        } catch (Exception e) {
//        }
//        
//        
// 
//        if (event.getTarget() == plus) {
//            komennot.hae("plus").suorita(arvo, arvo)
//            sovellus.plus(arvo);
//        } else if (event.getTarget() == miinus) {
//            sovellus.miinus(arvo);
//        } else if (event.getTarget() == nollaa) {
//            sovellus.nollaa();
//        } else {
//            System.out.println("undo pressed");
//        }
//        
//        int laskunTulos = sovellus.tulos();
//        
//        syotekentta.setText("");
//        tuloskentta.setText("" + laskunTulos);
//        
//        if ( laskunTulos==0) {
//            nollaa.disableProperty().set(true);
//        } else {
//            nollaa.disableProperty().set(false);
//        }
//        undo.disableProperty().set(false);
//    }

}
