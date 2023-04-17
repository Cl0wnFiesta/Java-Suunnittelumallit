public class Hyppääjä {
    private Hyppy pisteTaulu[][] = new Hyppy[2][2];
    private int hyppyjenLkm = 0;
    private String nimi;
    private IMediator mediator;

    public Hyppääjä(IMediator mediator, String nimi) {
        this.nimi = nimi;
        this.mediator = mediator;
    }

    public void hyppää() {
        System.out.println(nimi + " hyppää!");
    }

    public void receiveTulos(Hyppy hyppy) {
        pisteTaulu[hyppyjenLkm][hyppyjenLkm] = hyppy;
        hyppyjenLkm++;
        System.out
                .println(nimi + " hyppäsi " + hyppy.getPituus() + " metriä ja sai arvostelun " + hyppy.getArvostelu());
    }

    public int getArvostelu() {
        if (hyppyjenLkm != 0 && pisteTaulu[0][0] != null) {
            if (pisteTaulu[1][1] != null)
                return pisteTaulu[0][0].getArvostelu() + pisteTaulu[1][1].getArvostelu();
            return pisteTaulu[0][0].getArvostelu();
        }
        return 0;
    }

    public int getPituus() {
        if (hyppyjenLkm != 0 && pisteTaulu[0][0] != null) {
            if (pisteTaulu[1][1] != null)
                return pisteTaulu[0][0].getPituus() > pisteTaulu[1][1].getPituus() ? pisteTaulu[0][0].getPituus()
                        : pisteTaulu[1][1].getPituus();
            return pisteTaulu[0][0].getPituus();
        }
        return 0;
    }

    public int hyppyjenLkm() {
        return hyppyjenLkm;
    }

    public String getNimi() {
        return nimi;
    }
}