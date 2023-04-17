public class Tulosrivi {
    private IMediator mediator;
    private int hypynPituus;
    private int hypynPisteet;

    public Tulosrivi(IMediator mediator) {
        this.mediator = mediator;
    }

    public void receiveHypynTiedot(Hyppy hyppy) {
        hypynPituus = hyppy.getPituus();
        hypynPisteet = hyppy.getArvostelu();
        System.out.println("Pituus: " + hypynPituus);
        System.out.println("Pisteet: " + hypynPisteet);
    }

}
