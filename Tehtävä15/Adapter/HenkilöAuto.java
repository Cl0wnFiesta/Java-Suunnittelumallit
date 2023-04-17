public class HenkilöAuto {

    private int nopeus;

    public HenkilöAuto(int v) {
        this.nopeus = v;
    }

    public int getNopeus() {
        System.out.println("Ajoneuvo kulkee " + nopeus + "km/h");
        return nopeus;
    }

    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
}
