public class AutoAdapter implements LeluRekka {

    private Auto auto;

    public AutoAdapter(Auto auto) {
        this.auto = auto;
    }

    // Perus operaatio ajamiseen
    @Override
    public HenkilöAuto aja() {
        return auto.aja();
    }

    // Uusi operaatio, joka kutsuu perusoperaatiota ja hiljentää nopeutta
    @Override
    public HenkilöAuto ajaHiljalleen() {
        HenkilöAuto auto = this.auto.aja();
        return hiljennäNopeutta(auto, 10);
    }

    @Override
    public HenkilöAuto ajaHitaasti() {
        HenkilöAuto auto = this.auto.aja();
        return hiljennäNopeutta(auto, 5);
    }

    private HenkilöAuto hiljennäNopeutta(HenkilöAuto auto, int hidastusKerroin) {
        return new HenkilöAuto(auto.getNopeus() / hidastusKerroin);
    }
}
