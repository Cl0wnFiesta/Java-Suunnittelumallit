package Tehtävä11.Memento;

public class Arvuuttaja {
    private int arvaus;

    public Object liityPeliin() {
        arvaus = (int) (Math.random() * 10);
        System.out.println("Arvottu luku: " + arvaus);
        return new Memento(this.arvaus);

    }

    public boolean arvaa(Object obj, int asiakasArvaus) {
        Memento m = (Memento) obj;
        if (m.getArvaus() == asiakasArvaus) {
            System.out.println("\n" + "Arvasit oikein! Luvut olivat: " + m.getArvaus() + " ja " + asiakasArvaus);
            return true;
        } else {
            System.out.println("Arvasit väärin!");
            return false;
        }
    }

    private class Memento {
        private int arvaus;

        public Memento(int state) {
            this.arvaus = state;
        }

        public int getArvaus() {
            return arvaus;
        }
    }
}
