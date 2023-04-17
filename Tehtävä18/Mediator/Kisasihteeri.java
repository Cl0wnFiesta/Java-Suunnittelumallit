public class Kisasihteeri {

    private IMediator mediator;
    private int arvostelu;
    private int pituus;

    public Kisasihteeri(IMediator mediator) {
        this.mediator = mediator;
    }

    public void laskePisteetPituudesta(int hyppy) {
        pituus = hyppy;
        if (hyppy > 100) {
            arvostelu = 60;
            if (hyppy > 130) {
                arvostelu += (hyppy - 130) / 2;
            }
        } else if (hyppy < 100) {
            arvostelu = 60 - ((100 - hyppy) / 2);
        }
        System.out.println("Kisasihteeri: " + arvostelu);
    }

    public void saaArvostelu(int summa) {
        arvostelu += summa;
        Hyppy hyppy = new Hyppy(pituus, arvostelu);
        mediator.lisääHypynTulos(hyppy);
    }

}
