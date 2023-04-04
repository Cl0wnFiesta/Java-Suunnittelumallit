public class Auto implements HenkilöAuto {
    // a concrete implementation of HenkilöAuto
    @Override
    public void aja() {
        System.out.println("Ajetaan!");
    }
    
    @Override
    public void kerroNopeus() {
        System.out.println("140km/h");
    }
}
