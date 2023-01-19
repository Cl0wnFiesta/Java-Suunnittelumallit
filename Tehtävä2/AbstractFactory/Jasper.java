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
    
    public Farkut pueFarkut(VaateFactory factory){
        farkut = factory.pueFarkut();
        return farkut;
    }
    public Kenka pueKengät(VaateFactory factory){
        kenka = factory.pueKengät();
        return kenka;
    }
    public Lippis pueLippis(VaateFactory factory){
        lippis = factory.pueLippis();
        return lippis;
    }
    public Tpaita pueTpaita(VaateFactory factory){
        paita = factory.puePaita();
        return paita;
    }
    public void luettele(){
        System.out.println("Minulla on päällä " + farkut.toString() + ", " 
        + lippis.toString() + ", " + kenka.toString() + " sekä " + paita.toString() + ".");
    }
}
