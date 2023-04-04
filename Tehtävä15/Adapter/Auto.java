public class Auto implements HenkilöAuto {
    // a concrete implementation of HenkilöAuto
    private int nopeus;
    
    @Override
    public void aja() {
        System.out.println("Ajetaan!");
    }
    
    @Override
    public int kerroNopeus() {
        System.out.println(nopeus + "km/h");
        return nopeus;
    }

    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }


}
