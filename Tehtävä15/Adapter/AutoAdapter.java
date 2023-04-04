public class AutoAdapter implements LeluRekka {

    private Auto auto;
    public AutoAdapter(Auto auto) {
        this.auto = auto;
    }
    
    @Override
    public HenkilöAuto työnnä() {
        return auto.getNopeus();
    }
    
    @Override
    public HenkilöAuto työnnäKovaa() {
        HenkilöAuto auto = this.auto.getNopeus();
        return hiljennäNopeutta(auto, 140);
    }
    @Override
    public HenkilöAuto työnnäHitaasti() {
        HenkilöAuto auto = this.auto.getNopeus();
        return hiljennäNopeutta(auto, 40);
    }

    private HenkilöAuto hiljennäNopeutta(HenkilöAuto auto, int nopeus) {
        return new HenkilöAuto(nopeus);
    }
}
