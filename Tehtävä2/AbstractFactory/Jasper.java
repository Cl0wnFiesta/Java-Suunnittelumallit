package AbstractFactory;

public class Jasper{

    private Farkut farkut;
    private Kenka kenka;
    private Lippis lippis;
    private Tpaita paita;

    public Jasper(VaateFactory factory){
        farkut = factory.pueFarkut();
        kenka = factory.pueKengät();
        lippis = factory.pueLippis();
        paita = factory.puePaita();
    }

    public void luettele(){
        System.out.println("Minulla on päällä " + farkut.toString() + ", " 
        + lippis.toString() + ", " + kenka.toString() + " sekä " + paita.toString() + ".");

    }

    

}
