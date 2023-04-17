public class Mittamies {
    private IMediator mediator;

    public Mittamies(IMediator mediator) {
        this.mediator = mediator;
    }

    public void mittaa() {
        int pituus = (int) ((Math.random() + 1) * 80);
        System.out.println("Mittamies: " + pituus);
        mediator.kerroHypynPituus(pituus);
    }

}
