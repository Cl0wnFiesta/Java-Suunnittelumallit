public class Hyppy {
    private int pituus;
    private int arvostelu;

    public Hyppy(int pituus, int arvostelu) {
        this.pituus = pituus;
        this.arvostelu = arvostelu;
    }

    public int getPituus() {
        return pituus;
    }

    public void setPituus(int pituus) {
        this.pituus = pituus;
    }

    public void setArvostelu(int arvostelu) {
        this.arvostelu = arvostelu;
    }

    public int getArvostelu() {
        return arvostelu;
    }

}
