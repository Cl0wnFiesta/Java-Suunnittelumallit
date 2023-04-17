import java.util.List;

public class Tulostaulu {
    private IMediator mediator;

    public Tulostaulu(IMediator mediator) {
        this.mediator = mediator;
    }

    public void tulostaTaulu(List<Hyppääjä> hyppääjät) {
        System.out.println("Tulostaulu");
        System.out.println("Hyppääjä\tHyppy\tArvostelu\t\tPituus");
        for (Hyppääjä h : hyppääjät) {
            System.out.println(
                    h.getNimi() + "\t\t" + h.hyppyjenLkm() + "\t\t" + h.getArvostelu() + "\t\t\t" + h.getPituus());
        }
    }

}
