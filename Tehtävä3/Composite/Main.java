public class Main {
    public static void main(String[] args) {
        
        Verkkokortti kortti = new Verkkokortti(50);
        Prosessori prosessori = new Prosessori(100);
        Muistipiiri muisti = new Muistipiiri(50);
        Emolevy emolevy = new Emolevy(50);
        Kotelo kotelo = new Kotelo(110);
        
        emolevy.lisaaOsa(kortti);
        emolevy.lisaaOsa(prosessori);
        emolevy.lisaaOsa(muisti);

        kotelo.lisaaOsa(emolevy);

        System.out.println(emolevy.getHinta() + "$"); // 250
        System.out.println(kotelo.getHinta() + "$"); // 360
    }
}
