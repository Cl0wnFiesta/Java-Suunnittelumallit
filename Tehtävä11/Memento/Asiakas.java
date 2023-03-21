package Tehtävä11.Memento;

public class Asiakas extends Thread {
    private Object obj;
    private Arvuuttaja arvuuttaja;

    public Asiakas(String asiakasNumero) {
        super(asiakasNumero);
        this.arvuuttaja = new Arvuuttaja();
    }

    public void liityPeliin(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.obj = arvuuttaja.liityPeliin();
    }

    public synchronized boolean arvaa() {
        synchronized (this.arvuuttaja) {
            int guess = heitaArvaus();
            System.out.println(this.getName() + " arvaus: " + guess);
            boolean arvaus = arvuuttaja.arvaa(obj, guess);
            return arvaus;
        }
    }

    public int heitaArvaus() {
        return (int) (Math.random() * 10);
    }

    @Override
    public void run() {
        boolean oikein = false;
        while (!oikein) {
            oikein = arvaa();
        }
        System.out.println(this.getName() + " arvasi oikein!" + "\n");
    }

}
