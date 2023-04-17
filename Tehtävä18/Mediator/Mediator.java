import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
    private List<Hyppääjä> hyppääjä = new ArrayList<Hyppääjä>();
    private Hyppääjä currentHyppääjä;
    private Arvostelutuomari arvostelutuomari;
    private Mittamies mittamies;
    private Kisasihteeri kisasihteeri;
    private Tulosrivi tulosrivi;
    private Tulostaulu tulostaulu;
    private Hyppy hyppy;

    public Mediator() {
        this.arvostelutuomari = new Arvostelutuomari(this);
        this.kisasihteeri = new Kisasihteeri(this);
        this.mittamies = new Mittamies(this);
        this.tulosrivi = new Tulosrivi(this);
        this.tulostaulu = new Tulostaulu(this);
    }

    public void lisääHyppääjä(Hyppääjä hyppääjä) {
        this.hyppääjä.add(hyppääjä);
    }

    public void hyppää(Hyppääjä hyppääjä) {
        this.currentHyppääjä = hyppääjä;
        hyppy = new Hyppy();
        currentHyppääjä.hyppää();
        mittamies.mittaa();
    }

    public void kerroHypynPituus(int hyppyPituus) {
        kisasihteeri.laskePisteetPituudesta(hyppyPituus);
        arvostelutuomari.lisääArvostelu(hyppyPituus);
    }

    public void sendArvostelu(int hypynPisteet) {
        kisasihteeri.saaArvostelu(hypynPisteet);
    }

    public void lisääHypynTulos(int pituus, int arvostelu) {
        hyppy.setPituus(pituus);
        hyppy.setArvostelu(arvostelu);
        for (Hyppääjä h : hyppääjä) {
            if (h == currentHyppääjä) {
                currentHyppääjä.receiveTulos(hyppy);
            }
        }
        tulosrivi.receiveHypynTiedot(hyppy);
        tulostaulu.tulostaTaulu(hyppääjä);
    }

}
