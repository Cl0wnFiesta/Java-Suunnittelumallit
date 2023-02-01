public class Verkkokortti implements Laiteosa {
    private int hinta;
    
    public Verkkokortti(int hinta) {
        this.hinta = hinta;
    }
    
    public int getHinta() {
        return hinta;
    }
}