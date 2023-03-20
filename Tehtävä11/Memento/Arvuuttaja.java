package Tehtävä11.Memento;

public class Arvuuttaja {
      private int arvaus;
        
        public Object liityPeliin() {
            arvaus = (int) (Math.random() * 10);
            System.out.println("Arvottu luku: " + arvaus);
            return new Memento(this.arvaus);

        }
        
        public void setArvaus(int arvaus) {
            System.out.println("Arvauksesi: " + arvaus);
            this.arvaus = arvaus;
        }

        public void arvaa(Object obj) {
            Memento m = (Memento) obj;
            if(m.getArvaus() == arvaus) {
                System.out.println("Arvasit oikein!");
            } else {
                System.out.println("Arvasit väärin!");
            }
        }   

        private class Memento {
            private int arvaus;

            public Memento(int arvaus) {
                this.arvaus = arvaus;
            }

            public int getArvaus() {
                return arvaus;
            }

            public void setArvaus(int arvaus) {
                this.arvaus = arvaus;
            }
        }
}
