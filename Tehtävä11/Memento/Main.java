package Tehtävä11.Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas[] asiakas = new Asiakas[5];

        for (int i = 0; i < asiakas.length; i++) {
            asiakas[i] = new Asiakas("Asiakas " + i + "");
            asiakas[i].liityPeliin(arvuuttaja);
        }
        for (int i = 0; i < asiakas.length; i++) {
            asiakas[i].start();
        }
    }
}
