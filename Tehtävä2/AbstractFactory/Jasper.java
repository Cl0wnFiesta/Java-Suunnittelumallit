package AbstractFactory;

import AbstractFactory.interfaces.Farkut;
import AbstractFactory.interfaces.Lippis;
import AbstractFactory.interfaces.Kenka;
import AbstractFactory.interfaces.Tpaita;

public class Jasper{

    private Farkut farkut;
    private Kenka kenka;
    private Lippis lippis;
    private Tpaita paita;

    public void puePäälle(VaateFactory merkki){
        farkut = merkki.pueFarkut();
        kenka = merkki.pueKengät();
        lippis = merkki.pueLippis();
        paita = merkki.puePaita();
    }
    
    public void luettele(){
        System.out.println("Minulla on päällä " + farkut.toString() + ", " 
        + lippis.toString() + ", " + kenka.toString() + " sekä " + paita.toString() + ".");
    }
}
