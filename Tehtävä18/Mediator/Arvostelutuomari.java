import java.util.Arrays;

public class Arvostelutuomari {
    private int[] arvostelu = new int[5];
    private IMediator mediator;

    public Arvostelutuomari(IMediator mediator) {
        this.mediator = mediator;
    }

    public void lisääArvostelu(int hyppy) {
        for (int i = 0; i < arvostelu.length; i++) {
            arvostelu[i] = (int) ((Math.random() * 20) + 1);
            System.out.println("Arvostelutuomari: " + arvostelu[i]);
        }
        Arrays.sort(arvostelu);
        arvostelu[0] = 0;
        arvostelu[arvostelu.length - 1] = 0;
        sendArvostelu();
    }

    public void sendArvostelu() {
        int hypynPisteet = 0;
        for (int i = 0; i < arvostelu.length; i++) {
            hypynPisteet += arvostelu[i];
        }
        System.out.println("Arvostelutuomari yhteensä: " + hypynPisteet);
        mediator.sendArvostelu(hypynPisteet);
    }

}
